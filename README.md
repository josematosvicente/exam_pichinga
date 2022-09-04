
# NTTDATA Bootcamp Microservicios

El sistema a desarrollar está planteado en el contexto del negocio bancario que a medida que
se va avanzando en los proyectos, se irá ampliando en base a este mismo proyecto

## Modelo de arquitectura (Model C4)

### Nivel 1 - Diagrama de contexto del sistema

![Nivel 1 - Diagrama de contexto del sistema!](https://viewer.diagrams.net/?tags=%7B%7D&highlight=0000ff&edit=_blank&layers=1&nav=1&title=Bootcamp%20semana%201.drawio#R%3Cmxfile%20pages%3D%223%22%3E%3Cdiagram%20id%3D%22ujk5nt7GG_lKg_exM23N%22%20name%3D%22Nivel%201%20-%20Diagrama%20de%20contexto%20del%20sistema%22%3E7Zhbc5s4FMc%2FjR%2BT4WIc59FgJ53dZDddN7PPAo6BRkZUiNjOp98jIUBc4jTbTqfTKZPY1l9Hl3N09BMwc4P98ZaTIr1nMdCZY8XHmbueOY5tLzz8ksqpVjzPrYWEZ7E26oRt9gJatLRaZTGUPUPBGBVZ0RcjlucQiZ5GOGeHvtmO0f6oBUlgJGwjQsfqv1ks0lpdOled%2FgGyJBWtw9d1zZ40xtqTMiUxOxiSu5m5AWdM1L%2F2xwCoDF4Tl7rdzSu17cQ45OJrGiSrl7%2F9%2BOOf1V26FI9ONIcguNCLUYpT4zDE6L8uMi5SlrCc0E2n%2BpxVeQyyVwtLnc0dYwWKNoqfQYiTXkxSCYZSKvZU18akTFV7WYA8Xsl1wmJIWfRUSzcZbazHfmrXS1bxCM441%2BQL4QmIM3ZObSc9NwbQUbwFtgfBT2jAgRKRPfczg%2BgES1q7bg3wh14GVWThZ5mi6AwlEaSYisAHWTz%2Fi%2Bx1%2Fz7Jn7I8mcllXcwc15bRDqpS4Di8Mf90KrT5sGYNZcSzQmQsrw1WUm6NLLaToUkBP0McaeYExjByjjg3uarSVNqHVZnlUJZ1%2F5SEQOt%2BsRnF6Po7loteKi2%2BVKypuChVMsg52Ivi2FXir0R%2Fq17CTvB0NByvqcR4hsMGqNUj9%2BU4e24lr%2B5MxQo789ZGW9OumQI%2F19l7vbXPeat7iRjFGJu94EJE6ppq6%2FVXtxefqVgM3XTeooKZ%2F5oiBiGMnSxH09vc7u1smUSHNBNQFkTt0QMeD7IB7uug9da1lu7NlYd6KTh7ArNm4dpeoIcw9J26ZIuUqNTfHxN58lxG88s6ZXHmPqFZItM%2BQmZgtrs%2Bbk2yiTOh512wLBdq63kyPaxLDGFgqX%2BZHQFqtixpva9d9UUt2ANxSnMmxMku%2B2PjH1IXMKlIqBbBOofFZ%2BACjmdBpmtdVx9N%2Bmxe6uKhO%2BgcS2upecg1hu9gHxY1%2Fr4JhdtTKWA%2Fpt%2BW7cQBYzEyGWOQUnlT0LDPICIeU8i6UJAslxPjLK4iUSpU7oBjWiMETwNo%2Fmbhr85C5ywLu3shuyHetk88g5YqUXwSPSWqWUO1nOUwRqNtLWzfOgPAEeMIjxoWW5NIXXvWtT2G4ZAsIzg6YzpOEbPF2BiZzhRHfwq2GprTB%2B73AKzdB2xbNgk7nyKs8%2FMRVunbiBXgy%2BwlejJotCoKmkWkY%2BwrNP4RoDQgNdErrpu40BtHdkthJ16hyhi3E%2BR7L4T%2F%2F5Q0t81Qn8W3ybUvvl388XJ9%2B%2Fi4TIvk4%2FX9h6v7%2BsnvK7k2vM17g3O957uOSo41oJwG3whUC3WN0Vdfb4K0AaOKpOvL7Yohoysth0zgid%2F2wjhujOGM0DXcDZ%2FU86zVCQ1apYMPRCB2ZYdLDN18AqtMEGFiFXiGJhLVa45bk%2BQJhYdO9HN2pzeI1czugcRxPa6lHMNbl1XzUkMq%2Bq2HMQocC5I3d%2BA4TMVLfGL9B%2BqtVJvgHHWL9l4Y%2BOYZauqrkcKS0UrAqjtSfh8M3%2FFgsK%2F6B8PUrbdnTxwMzrcfDFjsXjopU%2BPVnbv5Dw%3D%3D%3C%2Fdiagram%3E%3Cdiagram%20id%3D%226kr5Hfd6z6B2QjgmZJdZ%22%20name%3D%22Nivel%202%20-%20Diagrama%20del%20contenedor%22%3E7VxZU9tIEP41rtp9gNJh%2BXj0AYGQcKxJYHnZGkljWSBrtKPxlV%2B%2FPYes0zYQxxBWTgJWT8%2Fd833dPao0zMF0%2BYmiaPKVuDhoGJq7bJjDhmHoesuCX1yykhLLMqXAo76rlFLByP%2BBlVBT0pnv4jinyAgJmB%2FlhQ4JQ%2BywnAxRShZ5tTEJ8r1GyMMlwchBQVl657tsIqUdo53Kz7DvTdh6wl1ZMkWJsppJPEEuWWRE5knDHFBCmPw2XQ5wwBcvWRdZ73RD6XpgFIfsORX%2BHpCLK3q6QpEfno9HTxetC%2FtItRKzVTJh7ML81SOhbEI8EqLgJJX2KZmFLuatavCU6nwhJAKhDsJHzNhKbSaaMQKiCZsGqtRF8UTU5w84dHt8n%2BDRDojzJEWnfpBol%2BeZDJrMqKNGfbkck3jgnM87Y6zNOg8%2BHhvJ5BiiHlZV7yZXZ9%2Bfflhz%2Bv3qwevOnBifHRlSj88804FaxU%2BYTDGjK1CgOEDMn%2BctAykD89Z66R7AF7UN4pHYj9xEYTIBcvAETBHTghU3L9FUtd9H4ZMfeg2%2Bra2GYep8tQezmEE%2FNFG%2FXUVKvVgyxLFD%2FYj5JJQKPS5eK2lkzJdmguGnDT01jEGmGz5GGBvfVa7K9e1Z7Ic4jmX7AbJxINuFagGsbn9MQpYzpda%2FM5IUHMXCGPgY9Fa0TAvhm6d%2Bi1bsVGCp1TCspBDW0y5WAJnsOS92%2FflaZMnGxFpBY9YwUzerlwyBbmvspbPVt81WteKQANY42wpshCM%2BVXWt%2FO7m1qdqLYrTNDKosPng5FEkgxCZk8x7U8dcz51sbkSLic9wHCFxRhdAD7wCnOvBeram1jFP2xbIY0bJE86WtEzdGqguMvKx%2BPAaEyRMf7r0OPMcO81jabIw8j4KfI%2BbvQOYAdZu9uFoohPXZ2rcEfFDJo6exc1DO4YlHGjiH7eOAch0%2FqTkeVk7L1QCvSCskhkVwsom833DX0BdDEaFbLEJ2jZYnGPK8HIrkKlSU2%2FKKgk3K6ZapERnaEo2yZJcR3sx9sGjgr9qdnq4JIuVs%2Bz1L43udO71LyPj4cOwU%2BXkjDI7VeqZ75KdvvoOJTGmc9%2FhFNJzp37owynmQyAV7ASnGAF%2FUImKn9Ec8dGFLvwcRVTyXJ%2F7QoZ2h%2B1xMFtuJrIg4G4dmC2ZCXdQTN4hlDeGwfxXbCIbFEuC3UQpw37IccBOWM1mH4vNNh%2B0jWyW4oWecNYoz1kZbBCG0kfOkyeqJbwUkhCXyU3XWnpf20JhJZZC1EnYVKskxaGldfUynRW5oURvRpnfqjhvTURl0jOqmPBdsGNGZuQpcw8UaRQY0qigyGYVRRo%2FTZHPweMUYIeIIRvFOCnJAG4ef5OBQWXsTEIwLk9N7isJPQ6Tl2R082Uj%2Bo7QPI0ZEhzlRzAcEwpBrzjD2UDijxjNAY7jrPZAoDEVG5PQwNhfSqjGdJpB6D8PCtEJqr4YjjMLbIluW2jKwSO042jdeLrgvw9wn7T4nzcBbnMrcCcBgLMKfEBwanLEVOhp7YZyW%2BL%2BFzsR5B3HFyG9YfaMYbcQDxkvQf4y1J%2B0h73hT0QurwfsfcPwL4hcCrDcfmewXJXEGa1ihqdl4JbykUMi3OeWhtRgQKkXRYHvoAz2kjFbwLoVmjsENmYQqKJV2DZ2pIyaNxvgMdsAGWUnuALWXuoav35ICr6zS70Vm3eCVvMF3mYxfbIDsnKRaeorGloBkRRIlTClJT5lWJKfnaCXgJZYSbPPTyssWdBTYpswiK7WrUA4hmlxRDA1OA23IhLXUkHi8PIJXiMGkMgb7MDSNSucXcK4r5M6u5j6oCI8HQgDGQq9AF%2Bnwn5IvqgDsgb2a%2BS6sl9NTAwCyl5yWcAl6jYh0wteRtxNkQ%2FQzYzGEGv%2FhRXjCBUYo6qxRmpMT%2BZYArboyY5JMGO4lzr6tbu%2BT3ddy%2FGC0S7zAkRlFcTQbu8%2FpVV512B%2BkJTWtouUnSmtvV%2B4iKowK7TKKKhjlbZ8zQWpsTQL6c9mp3CBVtDXm1v14YscQWor66lUmU%2FJXm7P465uX%2FQ6N9HZ2c3orn3mzpOl%2Bt%2FYS%2BUi6O%2FSXqz2fvf%2F7ubb5dHiZnHVcu8fg%2Fsu1Ub6kfXm%2B7%2FX7a2c494z3AeBg1Znr3DwsnRPNp8TCo%2F61WkffOwdq5T8SATzMj3TC71ZgHhFzJzjpHIpHZTLAMhL5QW2eYKIu1OiYyczCErAQo1TCAkjEsa%2B7Qc%2BWx0fLoypUzxvluLZDBE7UzyZO14wrr60rIypHzLXo%2Bud3mBY53oOl%2Bvp5nHW1J6b7Gnt36f%2F5%2Fzy6P62%2B5l9%2B05GdEk%2B%2F2tOPoyPts33ypJ45SLs3Uf7FdfUJMIUOQBlOBY3DiEKHR9E8TaG3eONtXzfKnMPPUUhfwERZJSnDxqFe5T6cvogBHiYy%2BnNx6u%2BnK6zXXtgxvp2ung7DY4fW4PrYV%2F2qcOMtwkzNjsn9U1yHV3sxNBDXiU%2FLwP4UaKLbam%2FnSnC5u8QXQwCn5%2FCAwcTotOGesWV2Lwf3rYwLKmSCynWpCjLRETES%2BpXYT9WtLH5uNXRRh1tvIIprVYdbVRHGxJJp2SOp%2BJdD3UPYq%2Ff%2FXojkK1DkLcJQTZ7MHUIUocgO4H1%2Fb7NWvB3rylxZw4jtcNbO7xv7%2FA%2BxvfGp%2BbVYNXvdhad0fSbgXclfmqH94M7vCUQroDqjbjcMfNvkx7S4eXvyKz%2FZxD58lD6%2F6uYJ%2F8B%3C%2Fdiagram%3E%3Cdiagram%20id%3D%22rXOd0vIDMFLTdm29v_h1%22%20name%3D%22Nivel%203%20-%20Diagrama%20de%20componentes%22%3E7V1bc%2BI4Fv41VO0%2BdMoXbMgjl2S3tjozmWVqd%2BZpSxgFNDGWVxYE5tfPkS3b8gUwDdh0R%2BlL8LFuPjr6ztEnWfTsyXr3D4bC1QtdYL9nGYtdz572LMt03T78EpJ9Ihk8GolgychCJsoFM%2FInlsI02YYscFRIyCn1OQmLQo8GAfZ4QYYYox%2FFZG%2FUL9YaoiWuCGYe8qvS%2F5IFXyXSoTXI5f%2FEZLlKazbdx%2BTOGqWJ5ZNEK7SgH4rIfurZE0YpTz6tdxPsC%2BWleknyPR%2B4mzWM4YA3yfC%2Fnb8MPv7DQkIc77f5%2B%2BuLsfoiS4n4Pn1gvIDnl5eU8RVd0gD5T7l0zOgmWGBRqgFXeZqvlIYgNEH4B%2BZ8LzsTbTgF0YqvfXl3gaJVnF9c4GAxEv0El3Ofeu%2BJ6Jn4aeqkhaJZBx88fQq6YR4%2B8rSWNCDElpgf00reP2DYmK4xZ3vIyLCPONkWG4KkhS2zdHknwAfZD%2FElnf8hbBQa7yMPr8AWMSuZcf8ntJblj1HwToJlT%2FSr27NsU6h7sok41MPS5L%2FuQ5m8fGeKI4%2BRkBMaJAlGQpwlMuibUMUKw%2F9zqKlnTZRqRBuhbaJbRVKRfr6JSICjKCnfR3PsJ%2BVCNh%2B0OX6jAS%2FYkvv%2FDU1vfIliaxBtMN1wl9%2BET0v5Oy5lngscqQ3LSW%2BCPuflDCBLai6KF2SbiZyksFhXUJgzVfKq6dImsGOFnfu05rGnlaV41Acdq6VAR3jxT11ep9i7Bf3U6aL8mNYpWLAU%2B5cwokCEMpRFbXKcm4WhLYzoY0U4jkIUj8kP8A8iAwzsSfa0tjG0nwcOyCPO6DtW77i26UxkFYr8Lf4ROVYoNv31bilcz4PXf0hMFlo%2BRj5ZCrP3ACPA2u0xDE30tCBctjukJODx0HOEeRgPoMKJEf8T1jEBmSmupLwoGxSFUmCWhHUyq0ZYW2SxbvgLsIvBqNA87gQj68YtZhzvjiNjFcjSDI7tJHmkd%2B5LX%2FWRuzrLkLKV6uaGxtngB5cS%2Fy7Cwtk%2B4nhdhb9EPvNoiMfCQSHZGEg0CkOfeChHwhl94x%2BgpVJxbWCagic1pUJX8i%2FSdkWxPn7jBwCgiow1IHUuXn57kyTEqqo%2BirQnIcg9CkF5DFKHQjHwzIrAcyj%2BQMyTWS2jhE8BDXAdNLnxTxWakh%2BQx4Y0Rt77Mm5nqbwUm2JN2mMxgkFl%2FkiK55SDi85KoQwGRrlF8GgwGn6N4y0jF4hHMuQDviIOyCcKHILq%2BlUIZJQjruAJgCeBJAItpwyGJgqWPn7NheOAfpUDxEhb94oWi6ReI34wn36M0qBbSGRUrtSCdyEKUgcB1WxYBAHVv3EylJIk0EaZI4NqzJ62OEHsuKZ5RP0Nx6Os82pB3aqieh3SZ%2FBbhXqrDv%2FvwicoMqvoKK7gGByj4BZcs%2BoXbHNQ4xicyx1Ds4lL2sJ2Zy6gPrb%2FTeR%2FcNLL31OzFRfTXeFqr14pY2majtIMhq44y0k76%2BQ0J5nEXn%2Ba07AHO5l7%2FmA96HTag1bn7EEnSu93qnT7cyp92KnS%2B59S6faNeLCGSnc%2Bp9IPhGYtKd39nErv1pEOPqfS3dsovQm1pPDmMIlHJIg58SAmVZIUubySLCsEe6sApuZLOU%2FCD8sHuPEvtEWzmJ2NSXVjFCw3PhIZMfce0swVfr5A6Sb0%2FAeeC%2BZdzKjjij2lEYyCGVjPDEchDSIyJz7he1l6S%2Bx8SqifzcQrynTial20FiRNMI%2FCrPBcud8PZ%2F%2Fkij%2BdcPaFRasqY1ZDl4N1jRPTUmz9FHk2T2Dn6zwVFHHoOPVVYv9NcziaTEsEnlUl1jLOv0LrV5cNngbT0bTKdjUm%2FL%2Bd8bk2j3MTwt8sEv62VcP49%2BsYf7clYsfsPtQ%2BuSSNd4QrHAJc%2Fa7cyRkEcbFXLsr8wRWdrt3U6ZqXOl2Z9VUMqNyyADSLnOGgzAQmjyCz5TYDmkZ7JZkcqAcrMrMdJLKioVPa93CqZaUM8CFpQ27CmVoujy6mgmNH0SVRxQsNlhTu%2FERnv3w9GD3M0FasZyUL%2Bmu6xeuYL5eBxDxbP6MhZvH6TLsL%2BTpUuKdQ4fjiWhoqeHufAKwysaQl12dMp90IwbJH1vRRRwjtRQjDMry6TSME6%2BII4bw9AS%2FEYxSC1y3xCBVIN1qsSUCgwxNHdnim12yXQKH8A8XrLQN3tGXAso%2FCmt4zoPcM6D0DN9sz4Bb9hjus%2Bo1B3ZYB%2B%2FKZ5Xl%2Bo4jjI8%2BD8SbwKdtiCyOUUd%2Bv3WRL1yGMJzmFOUwBzkImt6vF%2FiNzRk1IPy%2Bv4x5IvptswY1bca%2Bx%2B%2B231%2FbPcFQnHNNZ4bRrj5%2Bezwqfc1fn1rk1yxi6k8caR1GKTDXMXgtmTaPEs9Tt2b1RfN6Mwet3%2F1LJFYk1y2lIrPUvXSz%2FJjrMLW3VGw6Ps2F962j6W5BhhzzvhImoTTte7Xjbc7zqMr92vNrxnrMn2u7O8V5IjP0sOH%2F4HGBx9UwCFHgERNHVObKJT4QBt7i2oNmxptin36jR7JhmxzryHsPyKzX3S49pQkzH5W3H5YMzfJOOyzWyqshaWrAeNN7S1hoh1smWtu%2FiTbfktZ4m7JpdbwS3ZdfMfr9oXOluiEP0mmmVTlQoZbgtv6YZNe252%2Fbc6nt52nNrz33OUpZtdee6NaWmKbWLKbVHTalpSk1Tah25D7e0InPHnJrecqbj9E7j9MJRDjpO10B7FtAOSnF6zXlgHVNsjqbYjp4n0tqboedSbJXD5u7xfU69hU078ntx5CpWa0euHfkZjtwyy3vYjPYcuSbcNOF2KeFmW5pw04SbJtw6ch%2F9Dgm3hvPAH%2BokvXQvwendER2epKdZTj05upvJkX6%2FR3u3b%2FZu6YHDHUyOGnq34Q%2Fl3dzv2Ltp5k87t7ad2zkvcGnnpp2b6tzS9%2Fzv17nZj507tzMOfu07w55y9OuDYQ56tzv%2BteHhE0023F%2F65SUNj5UwS1ZzpdNfrfLa3%2F0dd9Hd2a%2FJ17gaKJ14GyR4o2wtiVf1u13%2FFqEtRBqRmlqcVO9tGEtCCEHHWcYb2WHxG2x2naeN%2Ft5qKKGPji2U0u3RsYVTbvTRsfro2Bxr7fTodoldj3cXYvSt7ynEaOts%2BYbv3jUJLi79QsGGL9VlR8Bf%2B2z5ytaiO3zdr%2Fv4AlA6dk0xBaKPkf%2B8scDx85Z1LPB5YwHTLH3RzHDQXjBw3yiqv6FDQ%2BtpaNXf0KGh9QCV6z7Wx5xtQKtYVaKUq%2FGs%2BDa5F7oQEPX0Fw%3D%3D%3C%2Fdiagram%3E%3C%2Fmxfile%3E)

### Nivel 2 - Diagrama del contenedor

![Nivel 2 - Diagrama del contenedor!](https://viewer.diagrams.net/?tags=%7B%7D&highlight=0000ff&edit=_blank&layers=1&nav=1&page-id=O-kgVfaqMr8SLMBScucg&title=Diagrama%20de%20Servicios#R%3Cmxfile%3E%3Cdiagram%20id%3D%22Bx6dSO8bz-AME_juLxk2%22%20name%3D%22Modelado%22%3E7Vtbb%2BI4FP41SN2HQbkQLo%2BFtrOrpVpmWakz%2B1K5iRu84%2BREjinQX792YicEc2unITNSEBKcL8eOc77P8fEJdNxJtP7MULK4hwDTjmMF645703Ec27aG4kMimxzpOV4OhIwEyqkE5uQVK9BS6JIEOK04cgDKSVIFfYhj7PMKhhiDVdXtGWj1rAkKsQHMfURN9IEEfJGjQ2dQ4r9jEi70me3%2BKD8SIe2sriRdoABWW5B723EnDIDn36L1BFMZPB2XvN3dgaPFwBiO%2BTkNPg2%2B3P8xnf919%2B%2BXh4c%2FJ%2F0VOK%2BfVC8viC7VBc8YBEsRyHzMfKMDka5IRFEsrPEzxHyujljC9heEBlO0gaUcSMqR%2F11b4wUw8ir8ERWHbAGIw4wrnl2r4jGXLVWfDKfCZ6avzt6B7tG64jhFKdejAUpRkpKnbHyyYYRYSOIxcA6RcjKDpyOBGcfrLUgF8zOGCHO2ES7qaF%2FxqoQ9VOaqVIk9UNhiSyGOBpFSZlj0XJInvij%2B3sClY3BJgsfkAJ3iInnGBoPveAIUmMBjyPkllO5AiJIwFibFz7KZjBIRk%2BRawREJAtnzOE2QT%2BJwmrnd9ErkbxUBCYFo%2FkyzubAQDbHoYZwAiXkWEW8s3iJGE6vrdTwx1omw7dIWb%2BnO%2BARiMXxEMgaxEMAKSxGMGXDE0VMhT5Pro1PhtAAU4%2B6ZjLt1Ee4ahMcowhnC%2FAViV7Zl%2FdYy%2F%2FHM95tmvmcwzzeJZP5qhlkKsbjbiuA51m2UiPsjYgTRVgg1CGHUtBDskaEEH3EcQjbKqxlKyQvkWrj2ufjeyqAGGdhO0zrQA9jWAUQkJRALNF5GmBG%2Fpb4G6r3GqTdzeEoiwh8DnEBKeMt%2Frfyfm%2FfXx7%2BZ9%2Bf8M8wJg5b%2BOukv6hTNbQL20R%2FjlvZaae81TbtnsD6hRF5lW7c5UbfxNHdHCje9PVQWK%2F2Hc9k3uCTBo5%2FRidvZe3L2emcr4EjhZh%2FjtU3egUH4M2Epf8zLNy3hH034vnrNRQkfmms0avmuje99ZZmL8u2aezJdoPuH8CVFLK%2FJ3BEWIXGXb6syNahgb1XmojIwi3PXvg%2FLNks7naW59juzNKcuMvWAqmkaOkBoO38PTYZfJ02zzbt4kZi3hH884Y2nabZZS2kfodfJeOOJmm0%2BQzd4xkGI9YKsuGTinh%2FgQK2AIpALCOVT1ylAosD%2FMOcbtRKjJQe5FvNIr9N4TfhXGdzuaOQp%2B1tmO72esm%2F0IpwZmy1jhhkR14%2BZxmIRi6%2FbRt6Xp82yq8wq%2BoqDa%2FkbKWHCi8whJHJHqB7lwXU8hSXz8bEEOPcT2UiIj1beVIcyxkcFwzBFnLzgyjD2yUE1ncnJUKYTRf6gc0N7R1H5SFWrHVEVw%2FgBnZlP7N%2BmM%2BsHdVbRmHdcYVpN9s%2BipsHPpiZr1HVGWy%2BvKi5v0HUdq3x51RPk12tozTiN6%2ByItu9dVrRmkfleLDwRlstMu4N54w7GPTe9qXELs7fS3G5hzn5O9OuVmm2z1qwrURMhe%2F3boCeI258G1aKA5jc1ZvEZRfmEbx8R10h843sbt6m9TbEbKVPGb5WM8X35Y7ln6g21Lfu1u9Zw9OY90%2FuzUV0lOJ2OepdJR3fzRGc3gWg%2B4RRm%2BU%2BX3L38v5B7%2Bz8%3D%3C%2Fdiagram%3E%3Cdiagram%20id%3D%229GDHkVFBNGfcMy80zV9w%22%20name%3D%22Nivel%201%20-%20Diagrama%20de%20contexto%20del%20sistema%22%3E7ZjbbuM2EIafxpcJdLCc5NKynW2BtAjqALlcUNJY4oYWVYqO7T59hwdJ1CHOprsoFosVcjB%2FDYfD4fCjrFm42p8%2BCVIVf%2FAM2CzwstMsXM%2BCwPe9W%2FynlLNR5kFkhFzQzBp1wpb%2BA1b0rHqgGdQ9Q8k5k7TqiykvS0hlTyNC8GPfbMdZf9SK5DAStilhY%2FWZZrIw6m1w0%2Bm%2FAc2LZmR%2FcWfu7EljbGdSFyTjR0cKN7NwJTiX5tP%2BtAKmktfkxfS7f%2BNuG5iAUn5Nh93y4fP2%2BPvx6vnzU%2FyYPMd39%2BmV9VLLczNhyHD%2BtsmFLHjOS8I2nRoLfigzUF49bHU2D5xXKPoofgEpz3YxyUFylAq5Z%2FZuRupC91cNKLOlWidsJoynL0a6p6yxNhGqsN6ceDMLfhApXJhtYAuIiBzkBbuwXR6sa%2BB7kOKM%2FQQwIulrPw5iCyxv7bo1wA92GXSTJ19UiWLsjKRQYCmCGFTx%2FE%2Byt%2F5jUr7QMp%2BpZV3MgtBX2V4daonjiMb86VxZ8%2BGdNdSpoJWkvDQGSyW3Rh7fqUwUgH8THGkWrJxhVIwYm1pVZarsk0NNS6hr45%2BRBJjxi90YJjPe8VL2Smnx94E3N65qXQwqBn9Rnbqb%2BCm3%2F7WXpBMimw1FDHMT85kMO6BmRu7LGX1tpcg407lCZ9Ha6evaNSGIS84%2BOlv%2F0mytl5QzzLHrBRci1ddU36i%2Fur38TOViOM3gPSoETv1bijiEcHayGs1uc7%2B3s1URHQsqoa6I3pJHPB5UB9zXq3a2oXcb3t9EqNdS8Bdw7yxCP1rZIRx9py%2FVoyC69PenXJ081%2Bn82pQsRh4TRnNV9ikiAqs9jHFrkk1GpY274rSUeutFqjy8a0zhytO%2FqjpWqPmqZfW%2BdtMXreAPxCktmBAnXfbHxh%2BkLmBRkUQvgtcu4ysICafLYByDzHYIQ3s02bP51jaP3UEXeFYr3EOuMfwA%2B7Bp8fdNKNyeawn7Mf22fCePOPGRyRiDjKmHgoZ9DhHxmELWJZLQUgUmeHZIZa1RuQOBZY0QPA%2Bg%2BYuFPzsLw4ss7J6F%2FIZ42z7xHFrqQolJ%2BpLrbg3VSl7CGI2%2Bt%2FBj7wIAR4wjIm1Y7E0idR15d%2F4YhkOyjOAYjOk4RcwWY2NkBlMc%2FSHY6mhBH7jfA7B%2BH7Bt2yXsfIqwwY9HWK1vU15BrKqX2GDQaFlVjKakY%2BwbNP4%2FQOlAasIrLqW8shtHuWWwk29QZYzbCfJ9FML%2FPSTLbTfVF%2FH9LtfmH%2BDa8DHvHc71vt91VAq8AeUs%2BEagWuhrjD5zvQvSBow6k2GsdjCmjC2tnHCJJ37rhQvcGMOIcGq4G57091mvExq0qgk%2BEonYVQ5vMXXzCaxySaSLVRAUTRSq1wK3JilzBo%2BdGJf8wW4Qr4nukWSZGdfTE8NHl2XzUkMp9q2HMwqcKlI2T%2BA4zEHU%2BI31LzBbyZhgjLZH%2BywMYvMKhvp6pKTm7CBh2R0pvw6G73gw%2BDf9g2Hq0TvyJw6G4NsPBmx2L520qfPqLtz8Cw%3D%3D%3C%2Fdiagram%3E%3Cdiagram%20id%3D%22O-kgVfaqMr8SLMBScucg%22%20name%3D%22Nivel%202%20-%20Diagrama%20del%20contenedor%22%3E7VxZc9pIEP41VO0%2BxKUDAX7ksHdry0l5g6uy%2BziSBqFYaJTRgGF%2F%2FfYckkYHAhIHSCF8odbc0%2FN93a02PXu62v5BUbL8SHwc9SzD3%2FbsWc%2ByTHvkwB8u2UmJY5tSENDQV4UKwTz8DyuhoaTr0MdpqSAjJGJhUhZ6JI6xx0oyRCl5KxdbkKjca4ICXBPMPRTVpV9Cny2ldGQNC%2FmfOAyWWc%2Fm4F7eWaGssJpJukQ%2BedNE9kPPnlJCmHy32k5xxBcvWxdZ73HP3XxgFMfsmAqv5mT69u1lFr887Tafv3ybzL7SD6qVlO2yCWMf5q8uCWVLEpAYRQ%2BFdELJOvYxb9WAq6LMEyEJCE0QfsWM7dRmojUjIFqyVaTu%2Bihdivr8Asf%2BmO8TXLoR8V6l6DGMstJyhHxYeyeezYKsqYdbZmspBUI0wKxtVYr9AcXGZIUZ3UFFiiPEwk15IEhpWJCXKzYB3qh9EJfE%2Fcp1FAYfIQ8vQRcxrahx%2FxNaqfYnKH4N46DH93XQs2yTL%2Fd0nTLoh2bFX3aJKl69M8OpR8OEhSSWBcZcnBcyyIIvxRLDbxd66llTrRs%2BRhgb31ZelJd312kY4zSV7UfIxZFsF6pFsJqTBYlZSZcG39Yku%2FEhFdrAx2AOkm1xE94F6q9oxS0EjloNy8luwnq61Qogkz2XxX64yUWObEysFTTmzLS6erlsCLStsVNna7bNVrXikQjWWG8FNsITr6a6Tnl3S%2BvTtBbVaVqHYMHS9F%2FBiAYR2lHmvalzbpaONleit2XIcJogcSbfgB94BTjY03y2tjGyH4cOyFNGySvW7wxs05mqLjT5Qrx4jSUSqr%2FaBpx67rz%2BnVRZGPkERWHA1d4DjABttydwNNGDHzI17oSEMRNHz%2BHqYdzBEk4N8cO1Ywoyk18peVk2LAuVwKwIm2RWg7CxyXLf8A2wi0GpkCs2wci3cYMpw9t2ZKwDmarQdxQ3ZeSsLt8KprMMJVvqLDcyTsY%2BuFTwdwI92TdFT%2F0j6cm5Bnb6GHqUpJhuQo9TyNhfhXEIp1gOoc5OcIoR8AeVqPgX2iA%2ButiH3%2FOESp6bcGPIMr5gdxGtt%2FuJLIq4XQdqS9bCHhST9wjljWE4ETu2lA2KJcF%2BVkhjP%2BR5oCesY7MbYLN%2BK5sVeGFmnDUvc5aGDUJRJsh7DUS1jJdiEuM6uZnGwJwYLRRWYylEvYxNjUZSnDnGvVmnsyo31OjNqvNbE%2BflRFQnPauJCa%2BCHTWZVabMd6BIq19mSKuBIvtNFGn9MEUeg8cFwM4QQy5Kc%2BjVALeMv9nAoDL2ljEoV6Am95HEAYfJT2T%2B99Ne9J2jTeEzZDjKj2C8IBS8XnGGdUfitxRtAI5TvfRUoDEVu5DRwCLcSqjGdKUh9O9nhegMVU%2BGY22BHdHtAK04eMRumuSNFwv%2B6wD3w4B%2FXQS4nVbgzhwAbxeFgODU5oip0NM5DOWuxP0nNxOUDceTkN6yx9bsvuIPWacgfx3qH4az8ewHPJfvB%2Bz3huGf4LlUYHl4ZbDcFMSZ71KGV3XglvK5RxI84ZqG1GCg0DhJotBDGvaSBXuDRao0dw5s1BCooVXYSfZBKTVvNsILtgcy6kZwA6ydahp%2F%2F5AUfOtL3YrNB0FrcIK1WQ2fHICskmda2IqWUUEkBVI1TBmIVx2W5Osg6GWgJVbSnvADDEsWjZXYJQy8q7wVcMcwrY4Ipgan4UV44kYhyAxePsFnxAASeYMjWLp%2Bg7FLGLd1CmMX0xCKCEsH3ECG4iDCz4VwEpMndUByYH9Gvi%2F7NcTEwKEcZ08LuEQ9TtB6wduEmynyArpZ0xQc3c9YMY4oAmNUNXKkxvRhgyVgi57clERrhseFod%2BZ6%2B9prpcDWtawzgvglTUQw3B4ppDW8KZCWtljvIMxrX7zth4d0xJVYVpopxVQ56po%2BZkLCm1xKvHP%2FqjyCK1S3uz328rDGzmCQlnyqTTpz3EKM%2BoUprGg9StoTN9sLf9zNOb%2B4hpzEYX40bD4WRRiMLoAhJiXx5CLaMTwV9CI%2B%2Fbyp2rEaVFDPSwYC8fsu6OH%2BC6468knO3MRE5JRvnEcrCPEK2Lm3WWVa1HFUiBJ5ia8YZfHGblVLjr2tEFQAjpqPVKcJiROQzeMQrZTrXeRwtuLFJYydvaHCrVcAdCuiVQtTdfPGTM0zdF4OutihmeLGfbtMtDaZt05bA4aDs7kG5q3lY4nTfhjiNz%2BQSL%2FGRkPj2GMYi%2FkCXJnSXaQqXpaCsMKxTx5FWSUR556lUdwXV7DWUjvgnkNJRe4S2zoIqUnRUrvu8yG9swGMPZYjq7nTRTrfItr8i3sVpjt0hBu16Wogug58xCOdCn6t%2BVSOMe6FIPmjb2oSzGNQpEQd05%2FQnUpE6SJy%2FvhbQvNkkVKXkVOi%2FIeSTAVd7pE6ltwONoT8jqHo3M49nOlM%2BgcjmaHQ0LpimzwSqQKqecfbp46eCGU7byQa%2FJC2vMKOy%2Fkdr2QKrJebzZ0xd59psRfe53B2xm812rwDltBtzN4O4N3PyyPKs%2Bbz2nwHhkcunym4MHgEN6G7B%2Fe2Z2jrv7V7sy2vSw9Hy522oX2DwAazx4TZDoYO8o%2F0edgNOpdEtDqGWODsmINjYq%2ByIGpWhWVecfksc5P6vykq%2FOTtM%2FW6vykzk9qI%2BRz%2Bkk8WTX%2FqDcJxMUH5tkP%2FwM%3D%3C%2Fdiagram%3E%3Cdiagram%20id%3D%22QbTG_JwCGH9bPNvJZ3Ia%22%20name%3D%22Nivel%203%20-%20Diagrama%20de%20componentes%22%3E7V1dc%2BI2F%2F41zPS92IwtYwOXfCTdaTedtHSm3UthFHBjLCqLBPrr3yNbtuUPwASwyUbsbjY%2BlmRJPnqeo3Mk0bHGq%2B3PDK%2BXj3RO%2FA4y5tuONekgNEAW%2FBSCXSzoGigWLJg3j0VmJph6%2FxEpNKR0481JmEvIKfW5t84LXRoExOU5GWaMvuWTPVM%2F%2F9Q1XpCSYOpivyz9y5vzZSzto14m%2F0q8xTJ5sukM4jsrnCSWLQmXeE7fFJF137HGjFIe%2F7bajokv%2Bi7plzjfw567acUYCXidDNby%2B%2BMf%2F9JfVhvy8uvfk5%2B%2Foq8PX2QpId8lDSZzaL%2B8pIwv6YIG2L%2FPpCNGN8GciFINuMrSfKN0DUIThP8QznfyZeINpyBa8pUv785xuIzyiwsSzIfiPcHlzKfuSyx68PwkdVxDUa29DU9aQTfMJQdaK1WPY7Yg%2FFCvoPT9gF4TuiKc7SAjIz7m3mu%2BIlhq2CJNl70E%2BEW%2Bh%2BiSzv4ROgqV97FLlqCLhBXUuPsbXsnyRzh48YJFR7xXp4MsU3T3eBNyeA5Lkv%2B5W8vkxTsTErrMW3OPBnGCoRCniQz6LLpiSeDnDJ7UQWPlMaKOUDfxWkVSkX62Cb2AhGFcvo9nxI%2FLhWw%2B9ObomQY8p0vOvxua3PgSRtog6mA66212E35byP%2BjUmaZwJa9gezkJvTnrJgBZPGT8%2BK595qK7LiwqK%2BgMHui5FXTJVVghwo7tbXmodbKUlzqQx%2BrpcCLcKNPVV47%2F3Zz%2FVPVF8VmomOwoOq%2FhBEFIpShLJ4mx7mZG9pCid6WHifhGkdj8g3oQWSAgT1OW2sZfeuhZ4M85Iy%2BEPWOY5n2WD5CkT9HH5FjiSPVX20Xgnnu3O5drLJQ8xH2vYVQexcwArTdGsHQxPdzj8t6r6kX8Gjo2UI9jDvowrER%2FRPaMQaZKa6kPC%2Fr5YVSYBaEVTJUIawsMv9s%2BAuwS0Cp8Cx6CUb6Gl8J42R7GBnLQJZksC07zpOyc3z5llEdMqRsqdJc3zgZ%2FOBS4t9ZWDjdhZysyvAXy6cuXZORICgsKwOJhuu177k4Q8IpfeZv0EuF4prANAVPKkqFV8m%2FSN0Vxfrkme8BgDIyVoDUqXj5%2FipJiFW7%2BiDSHoUg6yAEZTZIFQpFwDPNA88%2B%2BwMzV2ZFRgGfAhqQKmhyok8ZmuIPyCNFGmH3ZRHVs1Begk1RT1ojMYKhy%2FyhFM8oB4pOS6EMBkaxRtA0GA1%2FRvaWkQlEkwzZwCfMAflEgX3oum4ZAhnlmCt4AuDpQRKBlhMGQxMHC588ZcJRQL%2FJAWIktXvC83n8XCNqmE%2FfhonRLSTSKleeQrZrHCQEAY%2FZsBAMqj9IPJTiJFBHmSOFasLuX0mM2NGTZiH1N5wM05dXCeqojOpVSJ%2FCbxnqURX%2B3wQnKDKUJ4oLEINt5GjBMcu8YJm9CmKwzyeGehOXbhsTF%2Bg9tvtb5L%2Bzk8vvidaKi8k2d7VTr5ShNEkGaYpCF5zkmHVnOcos9H2znCgrjHe8UxLIQZiV%2FCQEis3hFGwOe1CYtxYzGKZxKAP8Etch0620MVXqVk%2B%2FbK1f5%2BqX2f8Q%2BuXYLaiX07rfpRWNcD6ERqQuuyY1ovcpNQKd62lriIO63RZUov85VaL7MVSiN2hBJQafUyU%2BCm%2B0YUok1vFn04nBx9AJu3cww5V0ov24Xhs6Ye3xatyYTliGcVGcqONKV%2BKENODYC6IYYBA5keMUmbyULC2EuMuA%2BnQh603uFndw4xf8iqdRNCoKIhrDYLHxschIuHuXZC7FI3MhrDgc%2BUZm8HMmPIjRg12lEoyClqIHRsI1DUJv5vke38nSG4pGJgHEkyOPSmfa0WMdvBJO6WAWrtPCs879ODHKe0f8aSVGmQvSlyMEFeFB0K5RrFqKrh8LFsxiVPw2SwR5mDzs6i9EO02zPxxPCgELVA4kpDHOUhizHCa9702Gk7J3v3aA8%2F0e7kv7ra8S4DTz0GwlYKZGOJO5XS7C6TTkyDat1qn66BIcsvW44paEq%2B%2FKncwpKS52ykXRJXlBmwB1a9oE5kWmk2W7ruiV7hUjH3ETZLZMZ062LorzzL59xOIs1qyQ4brWxUTEFHF4jlXxSIMFhTu%2F0env3%2FZaD1P8KuL38QKmFX0lqyg%2BKA2JWbpegK4Ji%2BLRzS5c0qbCLZkKKgbsNxXcne8BrDIRwpfxaNNu1kJA1hBNBtpCaM5C6Bfh1alrIaCzLYTT1kA9ei6jYLy%2Beq5HBdIN5ysv8OCFx0S2f6ZXb1VUrvw9xeslUje0RCq2bfUaKb1GSq%2BRan6NlJPnDadf5o1e1RIp6%2FyZ5Wm8kcfxoevCeBP4lG4pgBHKqO9XbiqgqzWMJzmF2e8CnK6ZXJ4b8UdKRnWcfm72jFtw8l1ly0FUi1u13a9vfzsnENURYjrJnHas0f3DSeZzRnVOFa0ho%2B%2BMBxVEUbBMNcxeCmbNQqykV7VH4Ur2eU0P3o%2B1dKdf07FmWdXv7brBtuJqvX7%2FsDesiw6mv4YzbB%2Fzjpmw2jTxauJtjnjVJbiaeDXxnrIHxGqPeM90jD14AQ5cT%2BxdvrBPbOx7QmEbjCVob1hdrBucgHXaG6a9YZotLsgW%2FeKWwdt1h2kHmLbDG7bDc1sttR2ukfUUZC0EqHu1l7A15QBLfUt6s2z1%2FrY63jS7WgmuvHS9uK8tWf2wd9cTKqx1L2S4rj9Ne9A0czfN3Egzt2bud4auLNQedZ%2FpQosdXdp%2F9nn8Z0ifuKX9Z9p%2F1hZXOIVwy%2B060BJqMLQhrg3x5gzxw3s4tCGuwfUAuPYKhnjFgYYt%2B9Bs7UM7ePpLY1s9T%2FWhlU59ucUNmnpNmibyWyFyvRhcE%2Fk7iRyZxUVpRnNEfqZH7YnR%2Bca9vEstV672qN2SR62nPWrao6Y9ai1xRbdFj1rNSd8PdcIrGtScp1nnHud5ka%2FX0tti9Uyo5ZnQKSvW9UxIs1uO3ez8QqwmZ0L12C2h3x%2BD3SzzA7ObdvNpcmuY3HJnMWty0%2BR2Crklu%2FRvmNxQ6%2BR2wrGtXbvfUQ5uvTPMXqfFw1vNuhG9y5wxcfxQCLOgNRc6uxUVA323d1hFeye3xl86beBk4m14wTNlK%2Bl4Vb%2BJ%2BqcQv4KlEaqpxTnz7oax2IQQ7jhkPHtbIv4HnV1lacP%2FNWpK6INfc6W0e%2FCrdXhNqz74dY9Jcq71cWmb4goHv1pmN4e1g9szMbofycS4nZPhjbrGxUW23B3fIpce4H7pk%2BFL64hucPNe%2B%2FYFoHRETZELRB8C%2F3ltAXW4a1tA2wIKMJqFr4np95ozBm4bRfX3a2hoPQ6th5d0amj9vNCKnEG1zdkEtIqoEqVctWfFd8E90rmAqPv%2FAw%3D%3D%3C%2Fdiagram%3E%3C%2Fmxfile%3E)


### Microservices - Client

Contiene los microservicios relacionados con el mantenimiento (CRUD) de clientes:

| Method | Path              | Description        |
|--------|-------------------|--------------------|
| GET    | /clients/{id}  | Listar Cliente     | 
| GET    | /clients | Obtener Cliente    | 
| POST   | /clients | Crear Cliente | 
| PUT    | /clients/{id}  | Actualizar Cliente | 
| DELETE | /clients/{id}  | Eliminar Cliente |

### Microservices - Administrative

Contiene los microservicios relacionados con las cuentas y productos asociados al cliente:

| Method | Path              | Description        |
|--------|-------------------|--------------------|
| POST    | /administrative/account | Listar Cliente     | 
| POST    | /administrative/credit | Obtener Cliente    | 

### Microservices - Financial

Contiene los microservicios relacionados con los movimientos financieros que realiza el cliente en sus diferentes productos bancarios:

| Method | Path              | Description                          |
|--------|-------------------|--------------------------------------|
| POST    | /finantial/account/{id}/movement| Abono / Retiro                       | 
| GET    | /finantial/account/{id}/balance | Saldo de cuenta                      | 
| POST   | /finantial/credit/{id}/movement | Consumo / Pago                       | 
| GET    | /finantial/credit/{id}/balance  | Saldo de cuenta                      |
| GET   | /finantial/account/{id}/movements | Listar movimiento bancarios cuentas  | 
| GET    | /finantial/credit/{id}/movements | Listar movimiento bancarios créditos |

### Microservices - Product

Contiene API relaciona con el mantenimiento (CRUD) de productos:

| Method | Path           | Description         |
|--------|----------------|---------------------|
| GET    | /products/{id} | Listar Producto      | 
| GET    | /products       | Obtener Producto     | 
| POST   | /products       | Crear Producto       | 
| PUT    | /products/{id}  | Actualizar Producto | 
| DELETE | /products/{id}  | Eliminar Producto    |


