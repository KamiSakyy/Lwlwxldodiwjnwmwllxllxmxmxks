package n1;

import java.util.Collection;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class b implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f29371r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Collection f29372s;

    public /* synthetic */ b(int i, Collection collection) {
        this.f29371r = i;
        this.f29372s = collection;
    }

    public final Object k(Object obj) {
        boolean contains;
        switch (this.f29371r) {
            case k5.f.J /* 0 */:
                contains = this.f29372s.contains(obj);
                break;
            case 1:
                contains = this.f29372s.contains(obj);
                break;
            default:
                contains = ((List) obj).retainAll(this.f29372s);
                break;
        }
        return Boolean.valueOf(contains);
    }
}
