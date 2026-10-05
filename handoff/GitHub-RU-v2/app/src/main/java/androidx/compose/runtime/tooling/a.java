package androidx.compose.runtime.tooling;

import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f1846a;

    public a(List list) {
        this.f1846a = list;
    }

    public final boolean a() {
        List list = this.f1846a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((b) list.get(i)).getClass();
        }
        return false;
    }
}
