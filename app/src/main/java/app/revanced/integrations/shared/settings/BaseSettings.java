package app.revanced.integrations.shared.settings;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class BaseSettings {
    public static final BooleanSetting DEBUG = new BooleanSetting("revanced_debug", FALSE);
    public static final BooleanSetting DEBUG_STACKTRACE = new BooleanSetting("revanced_debug_stacktrace", FALSE/*, parent(DEBUG)*/);
    public static final BooleanSetting DEBUG_TOAST_ON_ERROR = new BooleanSetting("revanced_debug_toast_on_error", TRUE, "revanced_debug_toast_on_error_user_dialog_message");
    public static final BooleanSetting DEBUG_PROTOBUFFER = new BooleanSetting("revanced_debug_protobuffer", FALSE/*, parent(DEBUG)*/);
}