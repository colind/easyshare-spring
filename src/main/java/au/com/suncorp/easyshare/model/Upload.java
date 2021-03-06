////////////////////////////////////////////////////////////////////////////////
//
// Copyright (c) 2015, Suncorp Metway Limited. All rights reserved.
//
// This is unpublished proprietary source code of Suncorp Metway Limited.
// The copyright notice above does not evidence any actual or intended
// publication of such source code.
//
////////////////////////////////////////////////////////////////////////////////

package au.com.suncorp.easyshare.model;

import javax.persistence.*;

import org.hibernate.annotations.Type;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import au.com.suncorp.easyshare.services.util.RandomUtil;
import org.joda.time.format.DateTimeFormat;

import java.text.DateFormat;

@Entity
@Table(name = "UPLOAD")
public final class Upload {

    @Id
    @NotNull
    @Size(min = 18)
    @Column(name = "KEY")
    public String key = RandomUtil.generateString(32);

    @NotNull
    @Size(min = 1, max = 320)
    @Column(name = "DESCRIPTION")
    private String description;

    public Upload() { }

    public Upload(String description) {
        this.description = description;
    }

    public String getKey() {
        return key;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
