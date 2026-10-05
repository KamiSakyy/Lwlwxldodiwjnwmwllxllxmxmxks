package i4;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public int f25782a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f25783b = -1;

    /* renamed from: c, reason: collision with root package name */
    public String f25784c = null;

    /* renamed from: d, reason: collision with root package name */
    public HashMap f25785d;

    public abstract void a(HashMap hashMap);

    public abstract b b();

    public b c(b bVar) {
        this.f25782a = bVar.f25782a;
        this.f25783b = bVar.f25783b;
        this.f25784c = bVar.f25784c;
        this.f25785d = bVar.f25785d;
        return this;
    }

    public abstract void d(HashSet hashSet);

    public abstract void e(Context context, AttributeSet attributeSet);

    public void f(HashMap hashMap) {
    }
}
