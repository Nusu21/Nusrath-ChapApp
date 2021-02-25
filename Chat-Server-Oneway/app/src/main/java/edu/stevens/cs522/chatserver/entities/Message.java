package edu.stevens.cs522.chatserver.entities;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

/**
 * Created by dduggan.
 */

public class Message implements Parcelable {

    public long id;

    public String chatRoom;

    public String messageText;

    public Date timestamp;

    public Double latitude;

    public Double longitude;

    public String sender;

    public long senderId;

    @Override
    public String toString() {
        return sender + ":" + messageText;
    }

    @Override
    public int describeContents() {
        return 0;
    }
    public Message (Parcel in) {
        // TODO
        this.id = in.readInt();
        this.chatRoom = in.readString();
        this.messageText = in.readString();
        //this.timestamp = in.readLong();
        this.timestamp.setTime(in.readLong());
        this.latitude = in.readDouble();
        this.longitude = in.readDouble();
        this.sender = in.readString();
        this.senderId = in.readLong();
        //sending date
    }



    @Override
    public void writeToParcel(Parcel dest, int flags) {
        // TODO
        dest.writeLong(this.id);
        dest.writeString(this.chatRoom);
        dest.writeString(this.messageText);
        dest.writeLong(this.timestamp.getTime());
        dest.writeDouble(this.latitude);
        dest.writeDouble(this.longitude);
        dest.writeString(this.sender);
        dest.writeLong(this.senderId);


    }

    public static final Creator<Message> CREATOR = new Creator<Message>() {

        @Override
        public Message createFromParcel(Parcel source) {
            // TODO
            return new Message(source);

        }

        @Override
        public Message[] newArray(int size) {
            // TODO
            return new Message[size];

        }

    };

}

