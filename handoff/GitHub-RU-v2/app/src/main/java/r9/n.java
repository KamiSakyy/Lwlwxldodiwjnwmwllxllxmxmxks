package r9;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import java.util.Arrays;

/* loaded from: /home/user/work/p/classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f31311a;

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap.Config f31312b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorSpace f31313c;

    /* renamed from: d, reason: collision with root package name */
    public final s9.h f31314d;

    /* renamed from: e, reason: collision with root package name */
    public final s9.g f31315e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f31316f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f31317g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f31318h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final q81.n f31319j;

    /* renamed from: k, reason: collision with root package name */
    public final r f31320k;
    public final o l;
    public final b m;

    /* renamed from: n, reason: collision with root package name */
    public final b f31321n;

    /* renamed from: o, reason: collision with root package name */
    public final b f31322o;

    public n(Context context, Bitmap.Config config, ColorSpace colorSpace, s9.h hVar, s9.g gVar, boolean z10, boolean z11, boolean z12, String str, q81.n nVar, r rVar, o oVar, b bVar, b bVar2, b bVar3) {
        this.f31311a = context;
        this.f31312b = config;
        this.f31313c = colorSpace;
        this.f31314d = hVar;
        this.f31315e = gVar;
        this.f31316f = z10;
        this.f31317g = z11;
        this.f31318h = z12;
        this.i = str;
        this.f31319j = nVar;
        this.f31320k = rVar;
        this.l = oVar;
        this.m = bVar;
        this.f31321n = bVar2;
        this.f31322o = bVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return k71.k.b(this.f31311a, nVar.f31311a) && this.f31312b == nVar.f31312b && k71.k.b(this.f31313c, nVar.f31313c) && k71.k.b(this.f31314d, nVar.f31314d) && this.f31315e == nVar.f31315e && this.f31316f == nVar.f31316f && this.f31317g == nVar.f31317g && this.f31318h == nVar.f31318h && k71.k.b(this.i, nVar.i) && k71.k.b(this.f31319j, nVar.f31319j) && k71.k.b(this.f31320k, nVar.f31320k) && k71.k.b(this.l, nVar.l) && this.m == nVar.m && this.f31321n == nVar.f31321n && this.f31322o == nVar.f31322o;
    }

    public final int hashCode() {
        int hashCode = (this.f31312b.hashCode() + (this.f31311a.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.f31313c;
        int e5 = x.i.e(x.i.e(x.i.e((this.f31315e.hashCode() + ((this.f31314d.hashCode() + ((hashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.f31316f), 31, this.f31317g), 31, this.f31318h);
        String str = this.i;
        return this.f31322o.hashCode() + ((this.f31321n.hashCode() + ((this.m.hashCode() + ((this.l.f31324r.hashCode() + ((this.f31320k.f31333a.hashCode() + ((((e5 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f31319j.r)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

}
