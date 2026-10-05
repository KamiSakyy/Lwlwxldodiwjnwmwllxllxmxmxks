package com.github.rudroid.pushnotifications;

import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@g81.e
/* loaded from: /home/user/work/p/classes.dex */
public final class SessionState {
    public static final Companion Companion;

    /* renamed from: r, reason: collision with root package name */
    public static final Object f18523r;

    /* renamed from: s, reason: collision with root package name */
    public static final SessionState f18524s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ SessionState[] f18525t;

    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final KSerializer serializer() {
            return (KSerializer) SessionState.f18523r.getValue();
        }
    }

    static {
        SessionState sessionState = new SessionState("Queued", 0);
        SessionState sessionState2 = new SessionState("InProgress", 1);
        SessionState sessionState3 = new SessionState("Completed", 2);
        SessionState sessionState4 = new SessionState("Failed", 3);
        SessionState sessionState5 = new SessionState("TimedOut", 4);
        SessionState sessionState6 = new SessionState("Cancelled", 5);
        SessionState sessionState7 = new SessionState("Unknown", 6);
        f18524s = sessionState7;
        SessionState[] sessionStateArr = {sessionState, sessionState2, sessionState3, sessionState4, sessionState5, sessionState6, sessionState7};
        f18525t = sessionStateArr;
        v8.l0.t(sessionStateArr);
        Companion = new Companion();
        f18523r = sy.w.s(w61.i.r, new com.github.rudroid.projects.triagesheet.singleselectionvaluepicker.f(9));
    }

    public static SessionState valueOf(String str) {
        return (SessionState) Enum.valueOf(SessionState.class, str);
    }

    public static SessionState[] values() {
        return (SessionState[]) f18525t.clone();
    }
}
