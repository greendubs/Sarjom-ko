package com.sarjom.citisci.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

@Getter
@Setter
@ToString
public class User {
    @BsonProperty(value = "_id")
    public ObjectId id;

    public String email;
    public String password;
    public String name;
    public String role;
}
