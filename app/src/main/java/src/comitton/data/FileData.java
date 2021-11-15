package src.comitton.data;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Comparator;

import src.comitton.common.DEF;


public class FileData {
	public static final short FILETYPE_PARENT = 0;
	public static final short FILETYPE_DIR = 1;
	public static final short FILETYPE_ARC = 2;
	public static final short FILETYPE_IMG = 3;
	public static final short FILETYPE_TXT = 4;
	public static final short FILETYPE_NONE = 5;

	public static final short EXTTYPE_NONE = 0;
	public static final short EXTTYPE_ZIP = 1;
	public static final short EXTTYPE_RAR = 2;
	public static final short EXTTYPE_PDF = 3;

	public static final short EXTTYPE_JPG = 4;
	public static final short EXTTYPE_PNG = 5;
	public static final short EXTTYPE_GIF = 6;
	public static final short EXTTYPE_WEBP = 8;
	public static final short EXTTYPE_BMP = 9;

	public static final short EXTTYPE_TXT = 7;
	public static final short EXTTYPE_EPUB = 50;

	private String name = "";
	private short filetype = FILETYPE_NONE;
	private short exttype = EXTTYPE_NONE;
	private int state;
	private long size;
	private long date;
	private boolean marker;
	private boolean loadFileAsTextFlag = false;

	public FileData () {
		;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public short getFileType() {
		return filetype;
	}

	public void setFileType(short type) {
		filetype = type;
	}

	public short getExtType() {
		return exttype;
	}

	public void setExtType(short exttype) {
		this.exttype = exttype;
	}

	public boolean getMarker() {
		return marker;
	}

	public void setMarker(boolean marker) {
		this.marker = marker;
	}

	public String getFileInfo() {
		String dateStr;
		if (date != 0) {
			SimpleDateFormat sdf = new SimpleDateFormat("[yyyy/MM/dd HH:mm:ss]");  
			dateStr = sdf.format(date);
		}
		else {
			dateStr = "[----/--/-- --:--:--]";
		}

		if (filetype == FILETYPE_PARENT) {
			return "";  
		}
		else if (filetype == FILETYPE_DIR) {
			return dateStr;  
		}
		else {
    		// サイズ
    		NumberFormat format = NumberFormat.getNumberInstance();
    		String sizeStr = format.format(size);
    		int len = sizeStr.length();
    		if (len > 11) {
    			sizeStr = "999,999,999";
    			len = 11;
    		}
    		sizeStr = ("           " + sizeStr).substring(len);
			return dateStr + " " + sizeStr + "Bytes";  
		}
	}

//	public String getFileSize() {
//		NumberFormat format = NumberFormat.getNumberInstance();
//		String sizeStr = format.format(size);
//		int len = sizeStr.length();
//		if (len > 11) {
//			sizeStr = "999,999,999";
//			len = 11;
//		}
//		sizeStr = ("           " + sizeStr).substring(len);
//		return sizeStr + "Bytes";  
//	}

	public void setDate(long date) {
		this.date = date;
	}

	// 日付取得
	public long getDate() {
		return this.date;
	}

	public void setSize(long size) {
		this.size = size;
	}
	public long getSize() {
		return this.size;
	}

	// ArrayListのindexOfから呼ばれる
	public boolean equals(Object obj){
		FileData fd = (FileData)obj;
		if (name.equals(fd.getName())) {
			return true;
		}
		return false;
	}

	public void setLoadFileAsTextFlag(boolean flag) {
		loadFileAsTextFlag = flag;
	}

	public boolean getLoadFileAsTextFlag() {
		return loadFileAsTextFlag;
	}

	public void setType(String filename) {
		name = filename;
		if (name == null){
			return;
		}
		String ext = DEF.getFileExt(name);
		if (name.substring(name.length() - 1).equals("/")) {
			filetype = FILETYPE_DIR;
		}
		else if (name.length() <= 4 || DEF.checkHiddenFile(name)) {
			//none
		}
		else if (ext.equals(".zip") || ext.equals(".cbz")) {
			filetype = FILETYPE_ARC;
			exttype = EXTTYPE_ZIP;
//			mFileTypeSub = FILETYPESUB_UNKNOWN;
		}
		else if (ext.equals(".rar") || ext.equals(".cbr")) {
			filetype = FILETYPE_ARC;
			exttype = EXTTYPE_RAR;
		}
		else if (ext.equals(".pdf")){
			//filetype = FILETYPE_ARC;
			//exttype = EXTTYPE_PDF;
		}
		else if (ext.equals(".jpg") || ext.equals(".jpeg")) {
			filetype = FILETYPE_IMG;
			exttype = EXTTYPE_JPG;
		}
		else if (ext.equals(".png")) {
			filetype = FILETYPE_IMG;
			exttype = EXTTYPE_PNG;
		}
		else if (ext.equals(".gif")) {
			filetype = FILETYPE_IMG;
			exttype = EXTTYPE_GIF;
		}
		else if (ext.equals(".webp")) {
			filetype = FILETYPE_IMG;
			exttype = EXTTYPE_WEBP;
		}
		else if (ext.equals(".bmp")) {
			filetype = FILETYPE_IMG;
			exttype = EXTTYPE_BMP;
		}
		else if (loadFileAsTextFlag && (ext.equals(".txt") || ext.equals(".xhtml") || ext.equals(".html"))) {
			filetype = FILETYPE_TXT;
			exttype = EXTTYPE_TXT;
		}
		else if (ext.equals(".epub")) {
			filetype = FILETYPE_ARC;
			exttype = EXTTYPE_ZIP;
			if (loadFileAsTextFlag){
				//filetype = FILETYPE_TXT;
				//exttype = EXTTYPE_EPUB;
			}
		}
		else{
			//none
		}
	}
}
