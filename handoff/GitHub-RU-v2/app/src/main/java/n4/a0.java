package n4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes.dex */
public final class a0 implements Handler.Callback, ServiceConnection {

    /* renamed from: r, reason: collision with root package name */
    public final Context f29412r;

    /* renamed from: s, reason: collision with root package name */
    public final Handler f29413s;

    /* renamed from: t, reason: collision with root package name */
    public final HashMap f29414t = new HashMap();

    /* renamed from: u, reason: collision with root package name */
    public HashSet f29415u = new HashSet();

    public a0(Context context) {
        this.f29412r = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f29413s = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(z zVar) {
        boolean z10;
        ArrayDeque arrayDeque = zVar.f29490d;
        ComponentName componentName = zVar.f29487a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
            arrayDeque.size();
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (zVar.f29488b) {
            z10 = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f29412r;
            boolean bindService = context.bindService(component, this, 33);
            zVar.f29488b = bindService;
            if (bindService) {
                zVar.f29491e = 0;
            } else {
                Objects.toString(componentName);
                context.unbindService(this);
            }
            z10 = zVar.f29488b;
        }
        if (!z10 || zVar.f29489c == null) {
            b(zVar);
            return;
        }
        while (true) {
            x xVar = (x) arrayDeque.peek();
            if (xVar == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    xVar.toString();
                }
                xVar.a(zVar.f29489c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Objects.toString(componentName);
                }
            } catch (RemoteException unused2) {
                Objects.toString(componentName);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(zVar);
    }

    public final void b(z zVar) {
        ComponentName componentName = zVar.f29487a;
        ArrayDeque arrayDeque = zVar.f29490d;
        Handler handler = this.f29413s;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = zVar.f29491e + 1;
        zVar.f29491e = i;
        if (i <= 6) {
            Log.isLoggable("NotifManCompat", 3);
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (1 << r4) * 1000);
        } else {
            arrayDeque.size();
            Objects.toString(componentName);
            arrayDeque.clear();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        c.cShadow cVar = null;
        if (i == 0) {
            x xVar = (x) message.obj;
            String string = Settings.Secure.getString(this.f29412r.getContentResolver(), "enabled_notification_listeners");
            synchronized (b0.f29416c) {
                if (string != null) {
                    try {
                        if (!string.equals(b0.f29417d)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String str : split) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                                if (unflattenFromString != null) {
                                    hashSet2.add(unflattenFromString.getPackageName());
                                }
                            }
                            b0.f29418e = hashSet2;
                            b0.f29417d = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = b0.f29418e;
            }
            if (!hashSet.equals(this.f29415u)) {
                this.f29415u = hashSet;
                List<ResolveInfo> queryIntentServices = this.f29412r.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            componentName.toString();
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    ComponentName componentName2 = (ComponentName) it.next();
                    if (!this.f29414t.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(componentName2);
                        }
                        this.f29414t.put(componentName2, new z(componentName2));
                    }
                }
                Iterator it2 = this.f29414t.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(entry.getKey());
                        }
                        z zVar = (z) entry.getValue();
                        if (zVar.f29488b) {
                            this.f29412r.unbindService(this);
                            zVar.f29488b = false;
                        }
                        zVar.f29489c = null;
                        it2.remove();
                    }
                }
            }
            for (z zVar2 : this.f29414t.values()) {
                zVar2.f29490d.add(xVar);
                a(zVar2);
            }
        } else if (i == 1) {
            y yVar = (y) message.obj;
            ComponentName componentName3 = yVar.f29485a;
            IBinder iBinder = yVar.f29486b;
            z zVar3 = (z) this.f29414t.get(componentName3);
            if (zVar3 != null) {
                int i10 = c.b.f3941f;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(c.c.f3942c);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof cShadow.c)) {
                        c.a aVar = new c.a();
                        aVar.f3940f = iBinder;
                        cVar = aVar;
                    } else {
                        cVar = (c.c) queryLocalInterface;
                    }
                }
                zVar3.f29489c = cVar;
                zVar3.f29491e = 0;
                a(zVar3);
                return true;
            }
        } else if (i == 2) {
            z zVar4 = (z) this.f29414t.get((ComponentName) message.obj);
            if (zVar4 != null) {
                if (zVar4.f29488b) {
                    this.f29412r.unbindService(this);
                    zVar4.f29488b = false;
                }
                zVar4.f29489c = null;
                return true;
            }
        } else {
            if (i != 3) {
                return false;
            }
            z zVar5 = (z) this.f29414t.get((ComponentName) message.obj);
            if (zVar5 != null) {
                a(zVar5);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.f29413s.obtainMessage(1, new y(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.f29413s.obtainMessage(2, componentName).sendToTarget();
    }
}
