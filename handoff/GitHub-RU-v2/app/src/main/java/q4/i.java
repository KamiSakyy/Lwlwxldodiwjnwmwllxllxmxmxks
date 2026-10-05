package q4;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: /home/user/work/p/classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f30955a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f30956b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30957c;

    public i(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f30955a = colorStateList;
        this.f30956b = configuration;
        this.f30957c = theme == null ? 0 : theme.hashCode();
    }
}
