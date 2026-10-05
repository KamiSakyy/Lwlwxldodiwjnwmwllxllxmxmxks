package p;

import android.view.ActionProvider;

/* loaded from: /home/user/work/p/classes.dex */
public final class o implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public kk.a f30298a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f30299b;

    public o(s sVar, ActionProvider actionProvider) {
        this.f30299b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z10) {
        kk.a aVar = this.f30298a;
        if (aVar != null) {
            l lVar = ((n) aVar.s).f30285n;
            lVar.f30257h = true;
            lVar.p(true);
        }
    }






}
