package n4;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: /home/user/work/p/classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public Bundle f29442a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f29443b;

    /* renamed from: c, reason: collision with root package name */
    public d0[] f29444c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f29445d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f29446e;

    /* renamed from: f, reason: collision with root package name */
    public int f29447f;

    /* renamed from: g, reason: collision with root package name */
    public CharSequence f29448g;

    /* renamed from: h, reason: collision with root package name */
    public PendingIntent f29449h;

    public j(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, d0[] d0VarArr, d0[] d0VarArr2, boolean z10, boolean z11) {
        this.f29446e = true;
        this.f29443b = iconCompat;
        if (iconCompat != null && iconCompat.c() == 2) {
            this.f29447f = iconCompat.b();
        }
        this.f29448g = p.b(charSequence);
        this.f29449h = pendingIntent;
        this.f29442a = bundle == null ? new Bundle() : bundle;
        this.f29444c = d0VarArr;
        this.f29445d = z10;
        this.f29446e = z11;
    }
}
