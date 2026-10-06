package gd;

import android.view.View;

/* loaded from: /home/user/work/p/classes.dex */
public final class a implements View.OnClickListener {

    /* renamed from: r, reason: collision with root package name */
    public final InterfaceC0070a f24871r;

    /* renamed from: s, reason: collision with root package name */
    public final int f24872s;

    /* renamed from: gd.a$a, reason: collision with other inner class name */
    public interface InterfaceC0070a {
        void a(View view, int i);
    }

    public a(InterfaceC0070a interfaceC0070a, int i) {
        this.f24871r = interfaceC0070a;
        this.f24872s = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f24871r.a(view, this.f24872s);
    }
}
