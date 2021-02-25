package edu.stevens.cs522.chatserver.Adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import edu.stevens.cs522.chatserver.R;

public class PeerAdapter extends BaseAdapter {
    @Override
    public int getCount() {
        return 0;
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
        //convertView = View.inflate(R.layout.view_peer, null);
      // TextView messageTextview  = convertView.findViewById(R.id.peer_list);
        //messageTextview.setText(messages.get(position).messageText);
        //return convertView;

        return null;
    }
}
