package com.back2261.authservice.interfaces.dto;

import io.github.GameBuddyDevs.backendlibrary.base.BaseModel;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageResponseBody extends BaseModel {

    List<MessageDto> reportedMessages;
}
