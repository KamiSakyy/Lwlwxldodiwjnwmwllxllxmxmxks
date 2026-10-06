package w2;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class g2 implements v2.n1 {

    /* renamed from: r, reason: collision with root package name */
    public int f33041r;

    /* renamed from: s, reason: collision with root package name */
    public List f33042s;

    /* renamed from: t, reason: collision with root package name */
    public Float f33043t = null;

    /* renamed from: u, reason: collision with root package name */
    public Float f33044u = null;

    /* renamed from: v, reason: collision with root package name */
    public d3.l f33045v = null;

    /* renamed from: w, reason: collision with root package name */
    public d3.l f33046w = null;

    public g2(int i, ArrayList arrayList) {
        this.f33041r = i;
        this.f33042s = arrayList;
    }

    @Override // v2.n1
    public final boolean p() {
        return this.f33042s.contains(this);
    }
}
