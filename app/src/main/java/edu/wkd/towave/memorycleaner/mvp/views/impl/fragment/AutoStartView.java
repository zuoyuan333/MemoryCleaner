package edu.wkd.towave.memorycleaner.mvp.views.impl.fragment;

import android.content.Context;
import android.widget.RelativeLayout;
import edu.wkd.towave.memorycleaner.adapter.AppsListAdapter;
import edu.wkd.towave.memorycleaner.adapter.AutoStartAdapter;
import edu.wkd.towave.memorycleaner.mvp.views.View;

/**
 * Created by Administrator on 2016/5/5.
 */
public interface AutoStartView extends View {
    void onProgressUpdate(int current, int max, String appName);

    void onPreExecute();

    void onPostExecute(AutoStartAdapter recyclerAdapter);

    void stopRefresh();

    void startRefresh();

    boolean isRefreshing();

    void enableSwipeRefreshLayout(boolean enable);

    void initViews(AutoStartAdapter recyclerAdapter, Context context);

    //RelativeLayout setDialogValues(String[] memory);
}
