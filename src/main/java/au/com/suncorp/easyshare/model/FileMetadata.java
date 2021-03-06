package au.com.suncorp.easyshare.model;

import javax.persistence.*;
import org.hibernate.annotations.Type;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import au.com.suncorp.easyshare.services.util.RandomUtil;

import java.util.UUID;

@Entity
@Table(name = "FILES")
public final class FileMetadata {

    @Id
    @NotNull
    @Size(min = 18)
    @Column(name = "ID")
    public UUID ID;

    @NotNull
    @Size(min = 1, max = 320)
    @Column(name = "FILENAME")
    private String filename;

    @NotNull
    @Size(min = 1, max = 320)
    @Column(name = "CONTENT_TYPE")
    private String contentType;

    @NotNull
    @Size()
    @Column(name = "CONTENT_LENGTH")
    private long contentLength;

    public FileMetadata() {}

    public FileMetadata(UUID fileID, String filename, String contentType, long contentLength) {
        this.ID = fileID;
        this.filename = filename;
        this.contentType = contentType;
        this.contentLength = contentLength;
    }

    public String getFilename() {
        return filename;
    }

    public String getContentType() {
        return contentType;
    }

    public long getContentLength() {
        return contentLength;
    }
}
