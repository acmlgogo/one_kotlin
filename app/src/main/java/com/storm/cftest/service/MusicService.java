package com.storm.cftest.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

import com.storm.cftest.IMyAidlInterface;

import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Map;

/**
 * 作者：程峰 on 2017/6/1
 * 邮箱：cf550272553@live.com
 * github :https://github.com/acmlgogo
 */

public class MusicService extends Service {
    public static final String PLAYSTATE_CHANGED = "playstatechanged";
    public static final String POSITION_CHANGED = "positionchanged";
    public static final String META_CHANGED = "metachanged";
    public static final String QUEUE_CHANGED = "queuechanged";
    public static final String PLAYLIST_CHANGED = "playlistchanged";
    public static final String REPEATMODE_CHANGED = "repeatmodechanged";
    public static final String SHUFFLEMODE_CHANGED = "shufflemodechanged";
    public static final String TRACK_ERROR = "trackerror";
    public static final String TIMBER_PACKAGE_NAME = "timber";
    public static final String MUSIC_PACKAGE_NAME = "music";
    public static final String SERVICECMD = "musicservicecommand";
    public static final String TOGGLEPAUSE_ACTION = "togglepause";
    public static final String PAUSE_ACTION = "pause";
    public static final String STOP_ACTION = "stop";
    public static final String PREVIOUS_ACTION = "previous";
    public static final String PREVIOUS_FORCE_ACTION = "force";
    public static final String NEXT_ACTION = "next";
    public static final String REPEAT_ACTION = "repeat";
    public static final String SHUFFLE_ACTION = "shuffle";
    public static final String FROM_MEDIA_BUTTON = "frommediabutton";
    public static final String REFRESH = "refresh";
    public static final String UPDATE_LOCKSCREEN = "updatelockscreen";
    public static final String CMDNAME = "command";
    public static final String CMDTOGGLEPAUSE = "togglepause";
    public static final String CMDSTOP = "stop";
    public static final String CMDPAUSE = "pause";
    public static final String CMDPLAY = "play";
    public static final String CMDPREVIOUS = "previous";
    public static final String CMDNEXT = "next";
    public static final String CMDNOTIF = "buttonId";
    public static final int NEXT = 2;
    public static final int LAST = 3;
    public static final int SHUFFLE_NONE = 0;
    public static final int SHUFFLE_NORMAL = 1;
    public static final int SHUFFLE_AUTO = 2;
    public static final int REPEAT_NONE = 0;
    public static final int REPEAT_CURRENT = 1;
    public static final int REPEAT_ALL = 2;
    public static final int MAX_HISTORY_SIZE = 1000;
    private static final String TAG = "MusicPlaybackService";
    private static final boolean D = false;
    private static final String SHUTDOWN = "shutdown";
    private static final int IDCOLIDX = 0;
    private static final int TRACK_ENDED = 1;
    private static final int TRACK_WENT_TO_NEXT = 2;
    private static final int RELEASE_WAKELOCK = 3;
    private static final int SERVER_DIED = 4;
    private static final int FOCUSCHANGE = 5;
    private static final int FADEDOWN = 6;
    private static final int FADEUP = 7;
    private static final int IDLE_DELAY = 5 * 60 * 1000;
    private static final long REWIND_INSTEAD_PREVIOUS_THRESHOLD = 3000;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    /**
     * MusicServierStub
     */
    private static final class ServiceStub extends IMyAidlInterface.Stub {
        private final WeakReference<MusicService> mService;

        private ServiceStub(final MusicService service) {
            mService = new WeakReference<MusicService>(service);
        }

        @Override
        public void openFile(String path) throws RemoteException {
//            mService.get().openFile(path);
        }

        @Override
        public void open(Map infos, long[] list, int position) throws RemoteException {

        }

        @Override
        public void stop() throws RemoteException {

        }

        @Override
        public void pause() throws RemoteException {

        }

        @Override
        public void play() throws RemoteException {

        }

        @Override
        public void prev(boolean forcePrevious) throws RemoteException {

        }

        @Override
        public void next() throws RemoteException {

        }

        @Override
        public void enqueue(long[] list, Map infos, int action) throws RemoteException {

        }

        @Override
        public Map getPlayinfos() throws RemoteException {
            return null;
        }

        @Override
        public void setQueuePosition(int index) throws RemoteException {

        }

        @Override
        public void setShuffleMode(int shufflemode) throws RemoteException {

        }

        @Override
        public void setRepeatMode(int repeatmode) throws RemoteException {

        }

        @Override
        public void moveQueueItem(int from, int to) throws RemoteException {

        }

        @Override
        public void refresh() throws RemoteException {

        }

        @Override
        public void playlistChanged() throws RemoteException {

        }

        @Override
        public boolean isPlaying() throws RemoteException {
            return false;
        }

        @Override
        public long[] getQueue() throws RemoteException {
            return new long[0];
        }

        @Override
        public long getQueueItemAtPosition(int position) throws RemoteException {
            return 0;
        }

        @Override
        public int getQueueSize() throws RemoteException {
            return 0;
        }

        @Override
        public int getQueuePosition() throws RemoteException {
            return 0;
        }

        @Override
        public int getQueueHistoryPosition(int position) throws RemoteException {
            return 0;
        }

        @Override
        public int getQueueHistorySize() throws RemoteException {
            return 0;
        }

        @Override
        public int[] getQueueHistoryList() throws RemoteException {
            return new int[0];
        }

        @Override
        public long duration() throws RemoteException {
            return 0;
        }

        @Override
        public long position() throws RemoteException {
            return 0;
        }

        @Override
        public int secondPosition() throws RemoteException {
            return 0;
        }

        @Override
        public long seek(long pos) throws RemoteException {
            return 0;
        }

        @Override
        public void seekRelative(long deltaInMs) throws RemoteException {

        }

        @Override
        public long getAudioId() throws RemoteException {
            return 0;
        }

        @Override
        public long getNextAudioId() throws RemoteException {
            return 0;
        }

        @Override
        public long getPreviousAudioId() throws RemoteException {
            return 0;
        }

        @Override
        public long getArtistId() throws RemoteException {
            return 0;
        }

        @Override
        public long getAlbumId() throws RemoteException {
            return 0;
        }

        @Override
        public String getArtistName() throws RemoteException {
            return null;
        }

        @Override
        public String getTrackName() throws RemoteException {
            return null;
        }

        @Override
        public boolean isTrackLocal() throws RemoteException {
            return false;
        }

        @Override
        public String getAlbumName() throws RemoteException {
            return null;
        }

        @Override
        public String getAlbumPath() throws RemoteException {
            return null;
        }

        @Override
        public String[] getAlbumPathtAll() throws RemoteException {
            return new String[0];
        }

        @Override
        public String getPath() throws RemoteException {
            return null;
        }

        @Override
        public int getShuffleMode() throws RemoteException {
            return 0;
        }

        @Override
        public int removeTracks(int first, int last) throws RemoteException {
            return 0;
        }

        @Override
        public int removeTrack(long id) throws RemoteException {
            return 0;
        }

        @Override
        public boolean removeTrackAtPosition(long id, int position) throws RemoteException {
            return false;
        }

        @Override
        public int getRepeatMode() throws RemoteException {
            return 0;
        }

        @Override
        public int getMediaMountedCount() throws RemoteException {
            return 0;
        }

        @Override
        public int getAudioSessionId() throws RemoteException {
            return 0;
        }

        @Override
        public void setLockscreenAlbumArt(boolean enabled) throws RemoteException {

        }

        @Override
        public void exit() throws RemoteException {

        }

        @Override
        public void timing(int time) throws RemoteException {

        }
    }

    /**
     *  music方法实现提供
     * */
    /**
     * openfile  打开文件   return 成功失败
     * @param path     文件路径
     */
    public boolean openFile(String path) {

        return false;
    }

}
