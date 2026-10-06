package v0;

import x.i;

/* loaded from: /home/user/work/p/classes.dex */
public final class d extends b {

    /* renamed from: b, reason: collision with root package name */
    public final String f32325b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32326c;

    /* renamed from: d, reason: collision with root package name */
    public final j71.c f32327d;

    public d(Object obj, String str, int i, j71.c cVar) {
        super(obj);
        this.f32325b = str;
        this.f32326c = i;
        this.f32327d = cVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextContextMenuItem(key=");
        sb2.append(this.f32322a);
        sb2.append(", label=\"");
        sb2.append(this.f32325b);
        sb2.append("\", leadingIcon=");
        return i.j(sb2, this.f32326c, ')');
    }
}
