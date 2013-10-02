package org.bigbluebutton.core.apps.whiteboard.messages

import org.bigbluebutton.core.api.InMessage
import org.bigbluebutton.core.api.IOutMessage

case class Annotation(id: String, status: String, shapeType: String, shape: Map[String, Object])

case class SendWhiteboardAnnotationRequest(meetingID: String, requesterID: String, annotation: Map[String, Object]) extends InMessage
case class SetWhiteboardActivePageRequest(meetingID: String, requesterID: String, page: Int) extends InMessage
case class SendWhiteboardAnnotationHistoryRequest(meetingID: String, requesterID: String, presentationID: String, page: Int) extends InMessage
case class ClearWhiteboardRequest(meetingID: String, requesterID: String) extends InMessage
case class UndoWhiteboardRequest(meetingID: String, requesterID: String) extends InMessage
case class SetActivePresentationRequest(meetingID: String, requesterID: String, presentationID: String, numPages: Int) extends InMessage
case class EnableWhiteboardRequest(meetingID: String, requesterID: String, enable: Boolean) extends InMessage
case class IsWhiteboardEnabledRequest(meetingID: String, requesterID: String) extends InMessage


case class SendWhiteboardAnnotationEvent(meetingID: String, recorded: Boolean, requesterID: String, shape: Map[String, Object]) extends IOutMessage
case class ChangeWhiteboardPageEvent(meetingID: String, recorded: Boolean, requesterID: String, page: Int) extends IOutMessage
case class ClearWhiteboardEvent(meetingID: String, recorded: Boolean, requesterID: String) extends IOutMessage
case class UndoWhiteboardEvent(meetingID: String, recorded: Boolean, requesterID: String) extends IOutMessage
case class WhiteboardActivePresentationEvent(meetingID: String, recorded: Boolean, requesterID: String, presentationID: String, numPages: Int) extends IOutMessage
case class WhiteboardEnabledEvent(meetingID: String, recorded: Boolean, requesterID: String, enable: Boolean) extends IOutMessage
case class IsWhiteboardEnabledReply(meetingID: String, recorded: Boolean, requesterID: String, enabled: Boolean) extends IOutMessage
