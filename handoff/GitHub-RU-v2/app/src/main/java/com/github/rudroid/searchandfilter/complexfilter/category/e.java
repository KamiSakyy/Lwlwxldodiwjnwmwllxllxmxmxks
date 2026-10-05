package com.github.rudroid.searchandfilter.complexfilter.category;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class e implements j71.a {
    public final /* synthetic */ int r;
    public final /* synthetic */ SelectableDiscussionCategoryFragment s;

    public /* synthetic */ e(SelectableDiscussionCategoryFragment selectableDiscussionCategoryFragment, int i) {
        this.r = i;
        this.s = selectableDiscussionCategoryFragment;
    }

    public final Object a() {
        switch (this.r) {
            case 0:
                return this.s.j4();
            default:
                SelectableDiscussionCategoryFragment selectableDiscussionCategoryFragment = this.s;
                com.github.rudroid.html.b bVar = selectableDiscussionCategoryFragment.H0;
                if (bVar != null) {
                    return new b(selectableDiscussionCategoryFragment, bVar);
                }
                k71.k.m("htmlStyler");
                throw null;
        }
    }
}
