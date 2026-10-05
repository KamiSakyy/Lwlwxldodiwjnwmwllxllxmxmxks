package wy0;

import java.util.Comparator;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b2 implements Comparator {
    public final /* synthetic */ int a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return sy.t.g(((yz0.f1) obj).a, ((yz0.f1) obj2).a);
            default:
                return sy.t.g(Boolean.valueOf(((yz0.j) obj2).e), Boolean.valueOf(((yz0.j) obj).e));
        }
    }
}
