package com.chargebee.models.enums;

public enum EventType {
    PLAN_CREATED,
    PLAN_UPDATED,
    PLAN_DELETED,
    ADDON_CREATED,
    ADDON_UPDATED,
    ADDON_DELETED,
    COUPON_CREATED,
    COUPON_UPDATED,
    COUPON_DELETED,
    COUPON_SET_CREATED,
    COUPON_SET_UPDATED,
    COUPON_SET_DELETED,
    COUPON_CODES_ADDED,
    COUPON_CODES_DELETED,
    COUPON_CODES_UPDATED,
    CUSTOMER_CREATED,
    CUSTOMER_CHANGED,
    CUSTOMER_DELETED,
    CUSTOMER_MOVED_OUT,
    CUSTOMER_MOVED_IN,
    PROMOTIONAL_CREDITS_ADDED,
    PROMOTIONAL_CREDITS_DEDUCTED,
    SUBSCRIPTION_CREATED,
    SUBSCRIPTION_CREATED_WITH_BACKDATING,
    SUBSCRIPTION_STARTED,
    SUBSCRIPTION_TRIAL_END_REMINDER,
    SUBSCRIPTION_ACTIVATED,
    SUBSCRIPTION_ACTIVATED_WITH_BACKDATING,
    SUBSCRIPTION_CHANGED,
    SUBSCRIPTION_TRIAL_EXTENDED,
    MRR_UPDATED,
    SUBSCRIPTION_CHANGED_WITH_BACKDATING,
    SUBSCRIPTION_CANCELLATION_SCHEDULED,
    SUBSCRIPTION_CANCELLATION_REMINDER,
    SUBSCRIPTION_CANCELLED,
    SUBSCRIPTION_CANCELED_WITH_BACKDATING,
    SUBSCRIPTION_REACTIVATED,
    SUBSCRIPTION_REACTIVATED_WITH_BACKDATING,
    SUBSCRIPTION_RENEWED,
    SUBSCRIPTION_SCHEDULED_CANCELLATION_REMOVED,
    SUBSCRIPTION_CHANGES_SCHEDULED,
    SUBSCRIPTION_SCHEDULED_CHANGES_REMOVED,
    SUBSCRIPTION_SHIPPING_ADDRESS_UPDATED,
    SUBSCRIPTION_DELETED,
    SUBSCRIPTION_PAUSED,
    SUBSCRIPTION_PAUSE_SCHEDULED,
    SUBSCRIPTION_SCHEDULED_PAUSE_REMOVED,
    SUBSCRIPTION_RESUMED,
    SUBSCRIPTION_RESUMPTION_SCHEDULED,
    SUBSCRIPTION_SCHEDULED_RESUMPTION_REMOVED,
    SUBSCRIPTION_ADVANCE_INVOICE_SCHEDULE_ADDED,
    SUBSCRIPTION_ADVANCE_INVOICE_SCHEDULE_UPDATED,
    SUBSCRIPTION_ADVANCE_INVOICE_SCHEDULE_REMOVED,
    PENDING_INVOICE_CREATED,
    PENDING_INVOICE_UPDATED,
    INVOICE_GENERATED,
    INVOICE_GENERATED_WITH_BACKDATING,
    INVOICE_UPDATED,
    INVOICE_DELETED,
    CREDIT_NOTE_CREATED,
    CREDIT_NOTE_CREATED_WITH_BACKDATING,
    CREDIT_NOTE_UPDATED,
    CREDIT_NOTE_DELETED,
    SUBSCRIPTION_RENEWAL_REMINDER,
    ADD_USAGES_REMINDER,
    TRANSACTION_CREATED,
    TRANSACTION_UPDATED,
    TRANSACTION_DELETED,
    PAYMENT_SUCCEEDED,
    PAYMENT_FAILED,
    PAYMENT_REFUNDED,
    PAYMENT_INITIATED,
    REFUND_INITIATED,
    @Deprecated
    NETD_PAYMENT_DUE_REMINDER,
    AUTHORIZATION_SUCCEEDED,
    AUTHORIZATION_VOIDED,
    CARD_ADDED,
    CARD_UPDATED,
    CARD_EXPIRY_REMINDER,
    CARD_EXPIRED,
    CARD_DELETED,
    PAYMENT_SOURCE_ADDED,
    PAYMENT_SOURCE_UPDATED,
    PAYMENT_SOURCE_DELETED,
    PAYMENT_SOURCE_EXPIRING,
    PAYMENT_SOURCE_EXPIRED,
    VIRTUAL_BANK_ACCOUNT_ADDED,
    VIRTUAL_BANK_ACCOUNT_UPDATED,
    VIRTUAL_BANK_ACCOUNT_DELETED,
    TOKEN_CREATED,
    TOKEN_CONSUMED,
    TOKEN_EXPIRED,
    UNBILLED_CHARGES_CREATED,
    UNBILLED_CHARGES_VOIDED,
    UNBILLED_CHARGES_DELETED,
    UNBILLED_CHARGES_INVOICED,
    ORDER_CREATED,
    ORDER_UPDATED,
    ORDER_CANCELLED,
    ORDER_DELIVERED,
    ORDER_RETURNED,
    ORDER_READY_TO_PROCESS,
    ORDER_READY_TO_SHIP,
    ORDER_DELETED,
    ORDER_RESENT,
    QUOTE_CREATED,
    QUOTE_UPDATED,
    QUOTE_DELETED,
    TAX_WITHHELD_RECORDED,
    TAX_WITHHELD_DELETED,
    TAX_WITHHELD_REFUNDED,
    GIFT_SCHEDULED,
    GIFT_UNCLAIMED,
    GIFT_CLAIMED,
    GIFT_EXPIRED,
    GIFT_CANCELLED,
    GIFT_UPDATED,
    HIERARCHY_CREATED,
    HIERARCHY_DELETED,
    PAYMENT_INTENT_CREATED,
    PAYMENT_INTENT_UPDATED,
    CONTRACT_TERM_CREATED,
    CONTRACT_TERM_RENEWED,
    CONTRACT_TERM_TERMINATED,
    CONTRACT_TERM_COMPLETED,
    CONTRACT_TERM_CANCELLED,
    ITEM_FAMILY_CREATED,
    ITEM_FAMILY_UPDATED,
    ITEM_FAMILY_DELETED,
    ITEM_CREATED,
    ITEM_UPDATED,
    ITEM_DELETED,
    ITEM_PRICE_CREATED,
    ITEM_PRICE_UPDATED,
    ITEM_PRICE_DELETED,
    ATTACHED_ITEM_CREATED,
    ATTACHED_ITEM_UPDATED,
    ATTACHED_ITEM_DELETED,
    DIFFERENTIAL_PRICE_CREATED,
    DIFFERENTIAL_PRICE_UPDATED,
    DIFFERENTIAL_PRICE_DELETED,
    FEATURE_CREATED,
    FEATURE_UPDATED,
    FEATURE_DELETED,
    FEATURE_ACTIVATED,
    FEATURE_REACTIVATED,
    FEATURE_ARCHIVED,
    ITEM_ENTITLEMENTS_UPDATED,
    ENTITLEMENT_OVERRIDES_UPDATED,
    ENTITLEMENT_OVERRIDES_REMOVED,
    ITEM_ENTITLEMENTS_REMOVED,
    ENTITLEMENT_OVERRIDES_AUTO_REMOVED,
    SUBSCRIPTION_ENTITLEMENTS_CREATED,
    BUSINESS_ENTITY_CREATED,
    BUSINESS_ENTITY_UPDATED,
    BUSINESS_ENTITY_DELETED,
    PURCHASE_CREATED,
    _UNKNOWN; /*Indicates unexpected value for this enum. You can get this when there is a
    java-client version incompatibility. We suggest you to upgrade to the latest version */
}