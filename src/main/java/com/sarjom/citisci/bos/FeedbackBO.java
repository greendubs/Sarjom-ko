package com.sarjom.citisci.bos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FeedbackBO {
    String id;
    String userId;
    String comments;
}
