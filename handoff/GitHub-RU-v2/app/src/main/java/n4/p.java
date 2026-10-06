package n4;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.foundation.lazy.layout.s0;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Context f29455a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f29459e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f29460f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f29461g;

    /* renamed from: h, reason: collision with root package name */
    public IconCompat f29462h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f29463j;
    public s0 l;
    public CharSequence m;

    /* renamed from: n, reason: collision with root package name */
    public String f29465n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f29466o;

    /* renamed from: q, reason: collision with root package name */
    public Bundle f29468q;

    /* renamed from: t, reason: collision with root package name */
    public String f29471t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f29472u;

    /* renamed from: v, reason: collision with root package name */
    public final Notification f29473v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f29474w;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f29456b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f29457c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f29458d = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f29464k = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f29467p = false;

    /* renamed from: r, reason: collision with root package name */
    public int f29469r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f29470s = 0;

    public p(Context context, String str) {
        Notification notification = new Notification();
        this.f29473v = notification;
        this.f29455a = context;
        this.f29471t = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f29463j = 0;
        this.f29474w = new ArrayList();
        this.f29472u = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Bundle bundle;
        w51.r rVar = new w51.r(this);
        p pVar = (p) rVar.u;
        s0 s0Var = pVar.l;
        if (s0Var != null) {
            s0Var.l(rVar);
        }
        Notification build = ((Notification.Builder) rVar.t).build();
        if (s0Var != null) {
            pVar.l.getClass();
        }
        if (s0Var != null && (bundle = build.extras) != null) {
            s0Var.g(bundle);
        }
        return build;
    }

    public final void c(int i, boolean z10) {
        Notification notification = this.f29473v;
        if (z10) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    public final void d(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f29455a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(2131165306);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(2131165305);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f2226k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f2228b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f29462h = iconCompat;
    }

    public final void e(s0 s0Var) {
        if (this.l != s0Var) {
            this.l = s0Var;
            if (((p) s0Var.f1480s) != this) {
                s0Var.f1480s = this;
                e(s0Var);
            }
        }
    }

    public Object b = null;
    public Object e = null;
    public Object f = null;
    public Object g = null;
    public Object j = null;
    public Object r = null;
    public Object t = null;
    public Object v = null;
}
