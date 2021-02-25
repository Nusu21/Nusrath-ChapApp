package edu.stevens.cs522.chatserver.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import edu.stevens.cs522.chatserver.R;
import edu.stevens.cs522.chatserver.activities.ChatServer;
import edu.stevens.cs522.chatserver.entities.Message;

public class MessageAdapter extends BaseAdapter {
    ChatServer chatServer;
    ArrayList<Message> messages;
    LayoutInflater inflater;
    public MessageAdapter (ChatServer chatServer, ArrayList<Message> messages) {
        this.chatServer = chatServer;
        this.messages = messages;
        this.inflater = LayoutInflater.from(chatServer);
    }

    @Override
    public int getCount() {
        return messages.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.message, null);
        TextView messageTextview  = convertView.findViewById(R.id.messageTextView);
        messageTextview.setText(messages.get(position).messageText);
        return convertView;

    }
}
