package z11;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import c21.u;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements ServiceConnection {
    public boolean r = false;
    public final LinkedBlockingQueue s = new LinkedBlockingQueue();

    public final IBinder a() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        u.f("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.r) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.r = true;
        IBinder iBinder = (IBinder) this.s.poll(10000L, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.s.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
