select 
    u.name as NAME,
    sum(t.amount) as BALANCE
    from users u
    left join transactions t on 
        u.account = t.account 
      group by u.account 
      having BALANCE  > 10000;