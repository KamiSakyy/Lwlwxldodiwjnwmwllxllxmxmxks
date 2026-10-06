package com.github.rudroid.starredreposandlists.bottomsheet;

import android.content.Context;
import android.content.Intent;
import com.github.rudroid.m0;
import com.github.rudroid.starredreposandlists.createoreditlist.CreateNewListActivity;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b extends com.github.rudroid.activities.util.e<w61.a0, C0006b> {
    public static final a Companion = new a();

    public static final class a {
    }

    /* renamed from: com.github.rudroid.starredreposandlists.bottomsheet.b$b, reason: collision with other inner class name */
    public static final class C0006b {
        public boolean a;

        public C0006b(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0006b) && this.a == ((C0006b) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return m0.i("ListCreationActivityResult(refreshNeeded=", ")", this.a);
        }
    }

    public final Intent R(Context context, Object obj) {
        k71.k.g((w61.a0) obj, "input");
        return new Intent(context, (Class<?>) CreateNewListActivity.class);
    }

    public static final Object y(Intent intent, int i) {
        return (intent == null || i != -1) ? new C0006b(false) : new C0006b(intent.getBooleanExtra("EXTRA_REFRESH_NEEDED", false));
    }
    public static Object f(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object z(Object p1, Object p2, Object p3, Object p4) { return null; }
}
