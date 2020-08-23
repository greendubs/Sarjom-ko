package com.sarjom.citisci.bos;

import com.sarjom.citisci.enums.FileType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@ToString
public class FileBO {
    public String id;
    public String uploadedByUserId;
    public String projectId;
    public String name;
    public String fileLink;
    public String comments;
    public String license;
    public BigDecimal latitude;
    public BigDecimal longitude;
    public Date createdAt;
    public String customTags;
    public FileType fileType;
    public UserBO uploadedByUser;
}
