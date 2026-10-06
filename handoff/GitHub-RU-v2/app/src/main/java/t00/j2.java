package t00;

import java.util.Comparator;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j2 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ j2(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return sy.tShadow.g(((yz0.f1Shadow) obj).a, ((yz0.f1Shadow) obj2).a);
            default:
                return sy.tShadow.g(Boolean.valueOf(((yz0.j) obj2).e), Boolean.valueOf(((yz0.j) obj).e));
        }
    }
}
