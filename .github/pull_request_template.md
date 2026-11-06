## What
<!-- One of two sentences: what this PR changes. -->

## Why
<!-- The problem or ticket this solves. Link it if there is one. -->

## How
<!-- Key decsions a reviewer should know. Mention alternatives you rejected and why. -->

## Release safety

* [ ] Behind a feature flag: `flag_name_here` (or: not needed because ...)
* [ ] Safe to ship in this week's train even if the flag stays off.
* [ ] No breaking change to any `:api` module, or every consumer is updated in this PR.

## Testing

* [ ] Unit tests added or updated.
* [ ] Screenshot tests added or updated for UI changes.
* [ ] UI test (Kaspresso) added or updated for a user flow change.
* [ ] Checked manually on minSdk (API 24) and latest API

<!-- How to verify by hand: steps, test account, flag to toggle. -->

## Screenshots

| Before | After |
|--------|-------|
|        |       |

## Checklist

* [ ] PR is small and does one thing (aim for under 300 changed lines)
* [ ] Impl modules depend only on api modules.
* [ ] New dependencies are declared in the version catalogue.
* [ ] Loading, empty, error, and offline states handled.
* [ ] Money uses minor units or `BigDecimal` with a currency, never floats
* [ ] No sensitive data in logs, analytic events or screenshots.

## Notes for the reviewer
<!-- Anything you are unsure about, or a question you want answered. -->
