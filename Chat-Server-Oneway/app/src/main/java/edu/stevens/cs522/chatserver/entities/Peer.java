package edu.stevens.cs522.chatserver.entities;

import android.os.Parcel;
import android.os.Parcelable;

import java.net.InetAddress;
import java.util.Date;

/**
 * Created by dduggan.
 */

public class Peer implements Parcelable {

    // Will be database key
    public long id;

    public String name;

    // Last time we heard from this peer.
    public Date timestamp;

    // Where we heard from them
    public Double latitude;

    public Double longitude;

    // Where they sent message from
    public InetAddress address;

    public int port;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        // TODO
        out.writeLong(this.id);
        out.writeString(this.name);
        out.writeLong(this.timestamp.getTime());
        out.writeDouble(this.latitude);
        out.writeDouble(this.longitude);
        //out.writeInt(this.address.);
        out.writeInt(this.port);

    }

    public Peer() {
    }

    public Peer(Parcel in) {
        // TODO
            this.id = in.readInt();
            this.name = in.readString();
            //this.timestamp = in.readLong();
            this.timestamp.setTime(in.readLong());
            this.latitude = in.readDouble();
            this.longitude = in.readDouble();
            this.port = in.readInt();
            //sending date
        }



    public static final Creator<Peer> CREATOR = new Creator<Peer>() {

        @Override
        public Peer createFromParcel(Parcel source) {
            // TODO
            return new Peer(source);
        }

        @Override
        public Peer[] newArray(int size) {
            // TODO
            return new Peer[size];
        }

    };
}
