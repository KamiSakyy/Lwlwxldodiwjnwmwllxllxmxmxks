package com.google.android.gms.internal.measurement;

import java.util.HashMap;

/* loaded from: /home/user/work/p/classes4.dex */
public enum w {
    s(0),
    t(1),
    u(2),
    v(3),
    w(56),
    x(57),
    y(58),
    z(59),
    A(60),
    B(61),
    C(62),
    D(53),
    E(4),
    F(5),
    G(52),
    H(6),
    /* JADX INFO: Fake field, exist only in values array */
    EF0(49),
    I(7),
    J(8),
    K(9),
    L(50),
    M(10),
    /* JADX INFO: Fake field, exist only in values array */
    EF0(11),
    N(12),
    O(13),
    P(51),
    Q(47),
    R(54),
    S(55),
    T(63),
    U(64),
    V(65),
    W(66),
    X(15),
    /* JADX INFO: Fake field, exist only in values array */
    EF0(48),
    Y(16),
    Z(17),
    a0(18),
    b0(19),
    c0(20),
    d0(21),
    e0(22),
    f0(23),
    g0(24),
    h0(25),
    i0(26),
    j0(27),
    k0(28),
    l0(29),
    m0(45),
    n0(30),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(31),
    o0(32),
    p0(33),
    q0(46),
    r0(34),
    s0(35),
    t0(36),
    u0(43),
    v0(37),
    w0(38),
    x0(39),
    y0(40),
    z0(44),
    A0(41),
    B0(42);

    public static final HashMap C0 = new HashMap();
    public final int r;

    static {
        for (w wVar : values()) {
            C0.put(Integer.valueOf(wVar.r), wVar);
        }
    }

    w(int i) {
        this.r = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.valueOf(this.r).toString();
    }
}
