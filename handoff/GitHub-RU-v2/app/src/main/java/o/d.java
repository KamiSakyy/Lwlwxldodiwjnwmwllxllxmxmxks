package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* loaded from: /home/user/work/p/classes.dex */
public final class d extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f29725f;

    /* renamed from: a, reason: collision with root package name */
    public int f29726a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f29727b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f29728c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f29729d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f29730e;

    public d(Context context, int i) {
        super(context);
        this.f29726a = i;
    }

    public final void a(Configuration configuration) {
        if (this.f29730e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f29729d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f29729d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f29727b == null) {
            this.f29727b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f29727b.setTo(theme);
            }
        }
        this.f29727b.applyStyle(this.f29726a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f29730e == null) {
            Configuration configuration = this.f29729d;
            if (configuration != null) {
                if (f29725f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f29725f = configuration2;
                }
                if (!configuration.equals(f29725f)) {
                    this.f29730e = createConfigurationContext(this.f29729d).getResources();
                }
            }
            this.f29730e = super.getResources();
        }
        return this.f29730e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f29728c == null) {
            this.f29728c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f29728c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f29727b;
        if (theme != null) {
            return theme;
        }
        if (this.f29726a == 0) {
            this.f29726a = 2132017920;
        }
        b();
        return this.f29727b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f29726a != i) {
            this.f29726a = i;
            b();
        }
    }
}
