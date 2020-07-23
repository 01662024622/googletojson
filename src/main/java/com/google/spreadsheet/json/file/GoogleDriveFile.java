package com.google.spreadsheet.json.file;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GoogleDriveFile {

  private String fileId;
  private String fileName;
  private String folderId;
  private String createdTime;
  private String modifiedTime;
}
