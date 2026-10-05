package androidx.compose.ui.layout;

import java.io.Serializable;

/* loaded from: /home/user/work/p/classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2023a;

    /* renamed from: b, reason: collision with root package name */
    public final o f2024b;

    /* renamed from: c, reason: collision with root package name */
    public final o f2025c;

    /* renamed from: d, reason: collision with root package name */
    public final o f2026d;

    /* renamed from: e, reason: collision with root package name */
    public final o f2027e;

    /* renamed from: f, reason: collision with root package name */
    public final Serializable f2028f;

    public p(String str) {
        this.f2023a = 1;
        this.f2028f = str;
        this.f2024b = new o(1, null);
        this.f2025c = new o(0, null);
        this.f2026d = new o(1, null);
        this.f2027e = new o(0, null);
    }

    public final o a() {
        switch (this.f2023a) {
        }
        return this.f2027e;
    }

    public final o b() {
        switch (this.f2023a) {
        }
        return this.f2024b;
    }

    public final o c() {
        switch (this.f2023a) {
        }
        return this.f2026d;
    }

    public final o d() {
        switch (this.f2023a) {
        }
        return this.f2025c;
    }

    public final String toString() {
        switch (this.f2023a) {
            case k5.f.J:
                return x61.l.R(57, (p[]) this.f2028f);
            default:
                String str = (String) this.f2028f;
                return str != null ? no.a.i(')', "RectRulers(", str) : super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(p[] pVarArr) {
        this.f2023a = 0;
        this.f2028f = pVarArr;
        int length = pVarArr.length;
        o[] oVarArr = new o[length];
        for (int i = 0; i < length; i++) {
            oVarArr[i] = ((p[]) this.f2028f)[i].b();
        }
        this.f2024b = new o(1, new a2(oVarArr, 0));
        int length2 = ((p[]) this.f2028f).length;
        o[] oVarArr2 = new o[length2];
        for (int i10 = 0; i10 < length2; i10++) {
            oVarArr2[i10] = ((p[]) this.f2028f)[i10].d();
        }
        this.f2025c = new o(0, new n(oVarArr2, 0));
        int length3 = ((p[]) this.f2028f).length;
        o[] oVarArr3 = new o[length3];
        for (int i11 = 0; i11 < length3; i11++) {
            oVarArr3[i11] = ((p[]) this.f2028f)[i11].c();
        }
        this.f2026d = new o(1, new a2(oVarArr3, 1));
        int length4 = ((p[]) this.f2028f).length;
        o[] oVarArr4 = new o[length4];
        for (int i12 = 0; i12 < length4; i12++) {
            oVarArr4[i12] = ((p[]) this.f2028f)[i12].a();
        }
        this.f2027e = new o(0, new n(oVarArr4, 1));
    }
}
