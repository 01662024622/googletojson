package com.google.spreadsheet.json.util.data;

import com.google.spreadsheet.json.file.GoogleDriveFile;

public class GoogleDriveFileUtil {

  private GoogleDriveFileUtil() {
  }

  public static FileImported convertGoogleDriveFileToFileImported(GoogleDriveFile file) {

      FileImported newFile = new FileImported();

      newFile.setFileId(file.getFileId());
      newFile.setFileName(file.getFileName());
      newFile.setDriveId(file.getFolderId());
      newFile.setCreatedTime(file.getCreatedTime());
      newFile.setModifiedTime(file.getModifiedTime());



    return newFile;
  }

  public static void importDrive(){

  }
}
