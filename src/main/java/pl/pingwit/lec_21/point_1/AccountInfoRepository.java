package pl.pingwit.lec_21.point_1;

import pl.pingwit.lec_20.homework.AccountInfo;

/**
 * @author Pavel Radkevich
 * @since 5.04.23
 */
public interface AccountInfoRepository extends Repository<AccountInfo, Long> {

    @Override
    AccountInfo create(AccountInfo o);

    @Override
    AccountInfo read(Long id);
}
