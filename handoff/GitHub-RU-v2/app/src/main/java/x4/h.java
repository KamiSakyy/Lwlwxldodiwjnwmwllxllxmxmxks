package x4;

import android.net.Uri;

/* loaded from: /home/user/work/p/classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public Uri f33775a;

    /* renamed from: b, reason: collision with root package name */
    public int f33776b;

    /* renamed from: c, reason: collision with root package name */
    public int f33777c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f33778d;

    /* renamed from: e, reason: collision with root package name */
    public String f33779e;

    /* renamed from: f, reason: collision with root package name */
    public int f33780f;

    public h(Uri uri, int i, int i10, boolean z10, int i11) {
        uri.getClass();
        this.f33775a = uri;
        this.f33776b = i;
        this.f33777c = i10;
        this.f33778d = z10;
        this.f33779e = null;
        this.f33780f = i11;
    }

    public h(String str, String str2) {
        this.f33775a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f33776b = 0;
        this.f33777c = 400;
        this.f33778d = false;
        this.f33779e = str2;
        this.f33780f = 0;
    }
}
