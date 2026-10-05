package n4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /home/user/work/p/classes.dex */
public final class e0 implements Iterable {

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f29438r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final Context f29439s;

    public e0(Context context) {
        this.f29439s = context;
    }

    public final void a(ComponentName componentName) {
        Context context = this.f29439s;
        ArrayList arrayList = this.f29438r;
        int size = arrayList.size();
        try {
            for (Intent a10 = e.a(context, componentName); a10 != null; a10 = e.a(context, a10.getComponent())) {
                arrayList.add(size, a10);
            }
        } catch (PackageManager.NameNotFoundException e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public final void b() {
        ArrayList arrayList = this.f29438r;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.f29439s.startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f29438r.iterator();
    }
}
