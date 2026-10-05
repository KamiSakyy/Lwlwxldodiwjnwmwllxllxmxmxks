package e6;

import androidx.glance.appwidget.protobuf.b0;

/* loaded from: /home/user/work/p/classes.dex */
public enum p implements b0 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0(0),
    f21963s(1),
    f21964t(2),
    f21965u(3),
    f21966v(4),
    f21967w(-1);


    /* renamed from: r, reason: collision with root package name */
    public final int f21969r;

    p(int i) {
        this.f21969r = i;
    }

    public final int a() {
        if (this != f21967w) {
            return this.f21969r;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
