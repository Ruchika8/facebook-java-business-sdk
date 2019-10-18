/**
 * Copyright (c) 2015-present, Facebook, Inc. All rights reserved.
 *
 * <p>You are hereby granted a non-exclusive, worldwide, royalty-free license to use, copy, modify,
 * and distribute this software in source code or binary form for use in connection with the web
 * services and APIs provided by Facebook.
 *
 * <p>As with any software that integrates with the Facebook platform, your use of this software is
 * subject to the Facebook Developer Principles and Policies [http://developers.facebook.com/policy/].
 * This copyright notice shall be included in all copies or substantial portions of the software.
 *
 * <p>THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.facebook.ads.sdk.serverside;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/** Server side pixel event */
public class Event {

  @SerializedName("event_name")
  private String eventName = null;

  @SerializedName("event_time")
  private Long eventTime = null;

  @SerializedName("event_source_url")
  private String eventSourceUrl = null;

  @SerializedName("opt_out")
  private Boolean optOut = null;

  @SerializedName("event_id")
  private String eventId = null;

  @SerializedName("user_data")
  private UserData userData = null;

  @SerializedName("custom_data")
  private CustomData customData = null;

  /**
   * Set Facebook pixel Standard Event or Custom Event name.
   *
   * @param eventName Facebook pixel Standard Event or Custom Event name.
   * @return Event
   */
  public Event eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

  /**
   * Get Facebook pixel Standard Event or Custom Event name.
   *
   * @return eventName
   */
  public String getEventName() {
    return eventName;
  }

  /**
   * Set Facebook pixel Standard Event or Custom Event name.
   *
   * @param eventName Facebook pixel Standard Event or Custom Event name.
   */
  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  /**
   * Set Unix timestamp in seconds indicating when the actual event occurred.
   *
   * @param eventTime Unix timestamp in seconds indicating when the actual event occurred
   * @return Event
   */
  public Event eventTime(Long eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  /**
   * Get Unix timestamp in seconds indicating when the actual event occurred.
   *
   * @return eventTime
   */
  public Long getEventTime() {
    return eventTime;
  }

  /**
   * Set Unix timestamp in seconds indicating when the actual event occurred.
   *
   * @param eventTime Unix timestamp in seconds indicating when the actual event occurred
   */
  public void setEventTime(Long eventTime) {
    this.eventTime = eventTime;
  }

  /**
   * Set browser URL where the event happened.
   *
   * @param eventSourceUrl rowser URL where the event happened
   *
   * @return Event
   */
  public Event eventSourceUrl(String eventSourceUrl) {
    this.eventSourceUrl = eventSourceUrl;
    return this;
  }

  /**
   * Get browser URL where the event happened.
   *
   * @return eventSourceUrl
   */
  public String getEventSourceUrl() {
    return eventSourceUrl;
  }

  /**
   * Set browser URL where the event happened.
   *
   * @param eventSourceUrl rowser URL where the event happened
   */
  public void setEventSourceUrl(String eventSourceUrl) {
    this.eventSourceUrl = eventSourceUrl;
  }

  /**
   * Set flag that indicates we should not use this event for ads delivery optimization. If set to
   * true, we only use the event for attribution.
   *
   * @param optOut indicates we should not use this event for ads delivery optimization
   * @return Event
   */
  public Event optOut(Boolean optOut) {
    this.optOut = optOut;
    return this;
  }

  /**
   * Get flag that indicates we should not use this event for ads delivery optimization. If set to
   * true, we only use the event for attribution.
   *
   * @return optOut
   */
  public Boolean isOptOut() {
    return optOut;
  }

  /**
   * Set flag that indicates we should not use this event for ads delivery optimization. If set to
   * true, we only use the event for attribution.
   *
   * @param optOut indicates we should not use this event for ads delivery optimization
   */
  public void setOptOut(Boolean optOut) {
    this.optOut = optOut;
  }

  /**
   * Set Event ID can be any string chosen by the advertiser. It is used by Facebook to deduplicate
   * the same event sent from both server and browser. The ID sent by server and browser for a given
   * event should match. IDs cannot be reused elsewhere in your app, even with a different
   * event_name or event_time.
   *
   * @param eventId ID can be any string chosen by the advertiser
   *
   * @return Event
   */
  public Event eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * Get Event ID can be any string chosen by the advertiser. It is used by Facebook to deduplicate
   * the same event sent from both server and browser. The ID sent by server and browser for a given
   * event should match. IDs cannot be reused elsewhere in your app, even with a different
   * event_name or event_time.
   *
   * @return eventId
   */
  public String getEventId() {
    return eventId;
  }

  /**
   * Set Event ID can be any string chosen by the advertiser. It is used by Facebook to deduplicate
   * the same event sent from both server and browser. The ID sent by server and browser for a given
   * event should match. IDs cannot be reused elsewhere in your app, even with a different
   * event_name or event_time.
   *
   * @param eventId ID can be any string chosen by the advertiser
   */
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * Set UserData object that contains user data
   *
   * @param userData object that contains user data
   *
   * @return Event
   */
  public Event userData(UserData userData) {
    this.userData = userData;
    return this;
  }

  /**
   * Get UserData object that contains user data
   *
   * @return userData
   */
  public UserData getUserData() {
    return userData;
  }

  /**
   * Set UserData object that contains user data
   *
   * @param userData object that contains user data
   */
  public void setUserData(UserData userData) {
    this.userData = userData;
  }

  /**
   * Set customData object that includes additional business data about the event.
   *
   * @param customData object that includes additional business data about the event.
   *
   * @return Event
   */
  public Event customData(CustomData customData) {
    this.customData = customData;
    return this;
  }

  /**
   * Get customData object that includes additional business data about the event.
   *
   * @return customData
   */
  public CustomData getCustomData() {
    return customData;
  }

  /**
   * Set customData object that includes additional business data about the event.
   *
   * @param customData object that includes additional business data about the event.
   */
  public void setCustomData(CustomData customData) {
    this.customData = customData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.eventName, event.eventName)
        && Objects.equals(this.eventTime, event.eventTime)
        && Objects.equals(this.eventSourceUrl, event.eventSourceUrl)
        && Objects.equals(this.optOut, event.optOut)
        && Objects.equals(this.eventId, event.eventId)
        && Objects.equals(this.userData, event.userData)
        && Objects.equals(this.customData, event.customData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        eventName, eventTime, eventSourceUrl, optOut, eventId, userData, customData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");

    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    eventSourceUrl: ").append(toIndentedString(eventSourceUrl)).append("\n");
    sb.append("    optOut: ").append(toIndentedString(optOut)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
    sb.append("    customData: ").append(toIndentedString(customData)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
