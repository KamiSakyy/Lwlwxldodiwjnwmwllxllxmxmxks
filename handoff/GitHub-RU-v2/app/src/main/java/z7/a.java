package z7;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.startup.StartupException;
import com.google.android.gms.internal.measurement.b4;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f34615d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f34616e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f34619c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f34618b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f34617a = new HashMap();

    public a(Context context) {
        this.f34619c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f34615d == null) {
            synchronized (f34616e) {
                try {
                    if (f34615d == null) {
                        f34615d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f34615d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f34619c.getString(2131951783);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f34618b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e5) {
                throw new StartupException(e5);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = this.f34617a;
        if (b4.U()) {
            try {
                Trace.beginSection(b4.s0(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a10 = bVar.a();
                if (!a10.isEmpty()) {
                    for (Class cls2 : a10) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = bVar.b(this.f34619c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th2) {
                throw new StartupException(th2);
            }
        }
        Trace.endSection();
        return obj;
    }
}
