package com.github.rudroid.views;

import com.github.rudroid.views.AutoCompleteView;

/* loaded from: /home/user/work/p/classes3.dex */
public class b implements AutoCompleteView.c.a {
    public final /* synthetic */ AutoCompleteView a;

    public b(AutoCompleteView autoCompleteView) {
        this.a = autoCompleteView;
    }

    @Override // com.github.rudroid.views.AutoCompleteView.c.a
    public final void a() {
        AutoCompleteView autoCompleteView = this.a;
        AutoCompleteView.c.a popUpWindowListener = autoCompleteView.getPopUpWindowListener();
        if (popUpWindowListener != null) {
            popUpWindowListener.a();
        }
        AutoCompleteView.a(autoCompleteView, false);
        if (autoCompleteView.getSpace().getVisibility() != 8) {
            autoCompleteView.getSpace().setVisibility(8);
        }
    }

    @Override // com.github.rudroid.views.AutoCompleteView.c.a
    public final void b() {
        AutoCompleteView autoCompleteView = this.a;
        AutoCompleteView.c.a popUpWindowListener = autoCompleteView.getPopUpWindowListener();
        if (popUpWindowListener != null) {
            popUpWindowListener.b();
        }
        AutoCompleteView.a(autoCompleteView, true);
        if (autoCompleteView.getSpace().getVisibility() != 0) {
            autoCompleteView.getSpace().setVisibility(0);
        }
    }
}
