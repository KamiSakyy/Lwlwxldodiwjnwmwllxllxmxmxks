package d8;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: /home/user/work/p/classes.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name */
    public View f21661b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f21660a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f21662c = new ArrayList();

    public v(View view) {
        this.f21661b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f21661b == vVar.f21661b && this.f21660a.equals(vVar.f21660a);
    }

    public final int hashCode() {
        return this.f21660a.hashCode() + (this.f21661b.hashCode() * 31);
    }

    public final String toString() {
        String f6 = x.i.f(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f21661b + "\n", "    values:");
        HashMap hashMap = this.f21660a;
        for (String str : hashMap.keySet()) {
            f6 = f6 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return f6;
    }
}
