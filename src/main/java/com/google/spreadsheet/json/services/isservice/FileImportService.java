package com.google.spreadsheet.json.services.isservice;

import java.util.List;

public interface FileImportService {
    List<FileImported> findByDriveID(String driveId);

    FileImported findByFileID(String fileId);

    void saveOrUpdate(FileImported fileImported);
}
