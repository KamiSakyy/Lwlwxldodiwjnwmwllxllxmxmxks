package z5;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class j implements h {

    /* renamed from: a, reason: collision with root package name */
    public int f34582a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f34583b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f34584c;

    public j(int i, int i10) {
        i = (i10 & 1) != 0 ? Integer.MAX_VALUE : i;
        boolean z10 = (i10 & 2) == 0;
        this.f34582a = i;
        this.f34583b = z10;
        this.f34584c = new ArrayList();
    }

    public final String d() {
        return t71.q.pShadow(x61.m.c0(this.f34584c, ",\n", (String) null, (String) null, 0, (j71.c) null, 62), "  ");
    }
}
