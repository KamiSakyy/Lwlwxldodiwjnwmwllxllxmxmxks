package f5;

import a5.l;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.util.Base64;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.core.widget.RemoteViewsCompatService;
import com.google.android.gms.measurement.internal.m;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes.dex */
public final class h implements RemoteViewsService.RemoteViewsFactory {

    /* renamed from: e, reason: collision with root package name */
    public static final d31.f f24354e = new d31.f(new long[0], new RemoteViews[0]);

    /* renamed from: a, reason: collision with root package name */
    public RemoteViewsCompatService f24355a;

    /* renamed from: b, reason: collision with root package name */
    public int f24356b;

    /* renamed from: c, reason: collision with root package name */
    public int f24357c;

    /* renamed from: d, reason: collision with root package name */
    public d31.f f24358d = f24354e;

    public h(RemoteViewsCompatService remoteViewsCompatService, int i, int i10) {
        this.f24355a = remoteViewsCompatService;
        this.f24356b = i;
        this.f24357c = i10;
    }

    public final void a() {
        Long l;
        RemoteViewsCompatService remoteViewsCompatService = this.f24355a;
        SharedPreferences sharedPreferences = remoteViewsCompatService.getSharedPreferences("androidx.core.widget.prefs.RemoteViewsCompat", 0);
        k71.k.f(sharedPreferences, "context.getSharedPrefere…S_FILENAME, MODE_PRIVATE)");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f24356b);
        sb2.append(':');
        sb2.append(this.f24357c);
        d31.f fVar = null;
        String string = sharedPreferences.getString(sb2.toString(), null);
        if (string != null) {
            byte[] decode = Base64.decode(string, 0);
            k71.k.f(decode, "decode(hexString, Base64.DEFAULT)");
            Parcel obtain = Parcel.obtain();
            k71.k.f(obtain, "obtain()");
            try {
                obtain.unmarshall(decode, 0, decode.length);
                obtain.setDataPosition(0);
                m mVar = new m(obtain);
                obtain.recycle();
                if (k71.k.b(Build.VERSION.INCREMENTAL, (String) mVar.a)) {
                    try {
                        l = Long.valueOf(Build.VERSION.SDK_INT >= 28 ? l.i(remoteViewsCompatService.getPackageManager().getPackageInfo(remoteViewsCompatService.getPackageName(), 0)) : r1.versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                        Objects.toString(remoteViewsCompatService.getPackageManager());
                        l = null;
                    }
                    if (l != null) {
                        if (l.longValue() == mVar.b) {
                            try {
                                byte[] bArr = (byte[]) mVar.c;
                                k71.k.g(bArr, "bytes");
                                obtain = Parcel.obtain();
                                k71.k.f(obtain, "obtain()");
                                try {
                                    obtain.unmarshall(bArr, 0, bArr.length);
                                    obtain.setDataPosition(0);
                                    d31.f fVar2 = new d31.f(obtain);
                                    obtain.recycle();
                                    fVar = fVar2;
                                } finally {
                                }
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                }
            } finally {
            }
        }
        if (fVar == null) {
            fVar = f24354e;
        }
        this.f24358d = fVar;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return ((long[]) this.f24358d.d).length;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i) {
        try {
            return ((long[]) this.f24358d.d)[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i) {
        try {
            return ((RemoteViews[]) this.f24358d.e)[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return new RemoteViews(this.f24355a.getPackageName(), 2131559119);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return this.f24358d.c;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        return this.f24358d.b;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
        a();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        a();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
    }
}
