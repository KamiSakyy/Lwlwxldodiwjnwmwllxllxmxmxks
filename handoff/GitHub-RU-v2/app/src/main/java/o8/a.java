package o8;

import e50.e;
import java.util.ArrayList;
import java.util.List;
import x.i;
import x61.l;
import x61.m;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f30095c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f30096a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30097b;

    static {
        e eVar = new e(8);
        List r10 = l.r(new Integer[]{0, 600, 840});
        ArrayList l02 = m.l0(r10, l.r(new Integer[]{1200, 1600}));
        List r11 = l.r(new Integer[]{0, 480, 900});
        e.a(eVar, r10, r11);
        e.a(eVar, l02, r11);
    }

    public a(int i, int i10) {
        this.f30096a = i;
        this.f30097b = i10;
        if (i < 0) {
            throw new IllegalArgumentException(no.a.l("Expected minWidthDp to be at least 0, minWidthDp: ", i, '.').toString());
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(no.a.l("Expected minHeightDp to be at least 0, minHeightDp: ", i10, '.').toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f30096a == aVar.f30096a && this.f30097b == aVar.f30097b;
    }

    public final int hashCode() {
        return (this.f30096a * 31) + this.f30097b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WindowSizeClass(minWidthDp=");
        sb2.append(this.f30096a);
        sb2.append(", minHeightDp=");
        return i.j(sb2, this.f30097b, ')');
    }
}
