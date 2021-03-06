// Copyright 2016 The Nomulus Authors. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package google.registry.model.domain.fee;

import google.registry.model.eppoutput.EppResponse.ResponseExtension;
import java.util.List;
import org.joda.money.CurrencyUnit;

/** Interface for fee extensions in Create, Renew, Transfer and Update responses. */
public interface FeeTransformResponseExtension extends ResponseExtension {

  /** Builder for {@link FeeTransformResponseExtension}. */
  public interface Builder {
    Builder setCurrency(CurrencyUnit currency);
    Builder setFees(List<Fee> fees);
    Builder setCredits(List<Credit> credits);
    FeeTransformResponseExtension build();
  }
}
